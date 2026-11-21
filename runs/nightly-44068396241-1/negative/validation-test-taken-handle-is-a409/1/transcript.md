# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 304 | `qa-5cd310c5-7ea1-42ab-b7d8-95c3730307af` |
| 2 | `POST /v1/accounts` | 409 | 27 | `qa-40c48962-b0e7-436b-8107-cbe48ec61310` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-54da853c-659b-4660-bc10-3a5ece386da5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-6439d3cd-dff6-4aa7-aece-cae9ad53fc7e` |
| 5 | `POST /v1/auth/token` | 401 | 30 | `qa-92324f31-8bb4-4f1b-a5b6-843421773450` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5cd310c5-7ea1-42ab-b7d8-95c3730307af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cd310c5-7ea1-42ab-b7d8-95c3730307af
Content-Type: application/json

--- request body ---
{"handle":"qa-479e21a84c90","displayName":"QA 479e21a84c90","password":"****","region":"eu"}

--- response: 201 in 304 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cd310c5-7ea1-42ab-b7d8-95c3730307af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-479e21a84c90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c81b7652-2457-4fc6-933a-f84598c0d567","handle":"qa-479e21a84c90","displayName":"QA 479e21a84c90","region":"eu","role":"user","createdAt":"2026-11-17T10:50:10.549548022Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-40c48962-b0e7-436b-8107-cbe48ec61310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40c48962-b0e7-436b-8107-cbe48ec61310
Content-Type: application/json

--- request body ---
{"handle":"qa-479e21a84c90","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 27 ms ---
Date: Tue, 17 Nov 2026 10:50:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-40c48962-b0e7-436b-8107-cbe48ec61310
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-479e21a84c90' is in use.","instance":"/v1/accounts","correlationId":"qa-40c48962-b0e7-436b-8107-cbe48ec61310"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-54da853c-659b-4660-bc10-3a5ece386da5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54da853c-659b-4660-bc10-3a5ece386da5
Content-Type: application/json

--- request body ---
{"handle":"qa-479e21a84c90","password":"****"}

--- response: 200 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-54da853c-659b-4660-bc10-3a5ece386da5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c81b7652-2457-4fc6-933a-f84598c0d567"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6439d3cd-dff6-4aa7-aece-cae9ad53fc7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6439d3cd-dff6-4aa7-aece-cae9ad53fc7e
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6439d3cd-dff6-4aa7-aece-cae9ad53fc7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-92324f31-8bb4-4f1b-a5b6-843421773450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92324f31-8bb4-4f1b-a5b6-843421773450
Content-Type: application/json

--- request body ---
{"handle":"qa-479e21a84c90","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92324f31-8bb4-4f1b-a5b6-843421773450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92324f31-8bb4-4f1b-a5b6-843421773450"}
```
