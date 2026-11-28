# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-ca2e3234-e117-4377-8631-396924a80c51` |
| 2 | `POST /v1/auth/token` | 200 | 56 | `qa-13a9ffa6-57d1-424d-9a72-0c7fa74f4ed2` |
| 3 | `GET /v1/accounts/me` | 200 | 53 | `qa-4e818d64-cb48-486e-b415-0994bc72321b` |
| 4 | `GET /v1/accounts/me` | 200 | 26 | `qa-248c04f9-9b3f-4d60-a921-a81f56adc1f7` |
| 5 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-78bc429e-bece-48f2-9cf8-911030cee273` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-8477fad7-272e-4b24-a7a7-6bb85d5fe8f1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ca2e3234-e117-4377-8631-396924a80c51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca2e3234-e117-4377-8631-396924a80c51
Content-Type: application/json

--- request body ---
{"handle":"qa-6078e4d8b4e3","displayName":"QA 6078e4d8b4e3","password":"****","region":"eu"}

--- response: 201 in 376 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca2e3234-e117-4377-8631-396924a80c51
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
Location: /v1/accounts/qa-6078e4d8b4e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d255618-253c-4b51-be1c-86f8ba273ac4","handle":"qa-6078e4d8b4e3","displayName":"QA 6078e4d8b4e3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.235794377Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-13a9ffa6-57d1-424d-9a72-0c7fa74f4ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13a9ffa6-57d1-424d-9a72-0c7fa74f4ed2
Content-Type: application/json

--- request body ---
{"handle":"qa-6078e4d8b4e3","password":"****"}

--- response: 200 in 56 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-13a9ffa6-57d1-424d-9a72-0c7fa74f4ed2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d255618-253c-4b51-be1c-86f8ba273ac4"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e818d64-cb48-486e-b415-0994bc72321b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e818d64-cb48-486e-b415-0994bc72321b
Content-Type: application/json

--- response: 200 in 53 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e818d64-cb48-486e-b415-0994bc72321b
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
Content-Length: 181

{"id":"acc_5d255618-253c-4b51-be1c-86f8ba273ac4","handle":"qa-6078e4d8b4e3","displayName":"QA 6078e4d8b4e3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.235794377Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-248c04f9-9b3f-4d60-a921-a81f56adc1f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-248c04f9-9b3f-4d60-a921-a81f56adc1f7
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-248c04f9-9b3f-4d60-a921-a81f56adc1f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d255618-253c-4b51-be1c-86f8ba273ac4","handle":"qa-6078e4d8b4e3","displayName":"QA 6078e4d8b4e3","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.235794377Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78bc429e-bece-48f2-9cf8-911030cee273

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78bc429e-bece-48f2-9cf8-911030cee273
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78bc429e-bece-48f2-9cf8-911030cee273
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8477fad7-272e-4b24-a7a7-6bb85d5fe8f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8477fad7-272e-4b24-a7a7-6bb85d5fe8f1
Content-Type: application/json

--- request body ---
{"handle":"qa-6078e4d8b4e3","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8477fad7-272e-4b24-a7a7-6bb85d5fe8f1
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8477fad7-272e-4b24-a7a7-6bb85d5fe8f1"}
```
