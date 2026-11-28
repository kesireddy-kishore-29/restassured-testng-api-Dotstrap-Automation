# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-f0d63be0-68b4-44ec-a863-6942160f401c` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-35a190ac-8980-4eb1-8dbe-f86a116cbc67` |
| 3 | `GET /v1/conversations/{id}` | 404 | 19 | `qa-519f731c-f35c-4d27-992d-cbd40906ea66` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 11 | `qa-899552a2-b2bc-4611-9478-cccd8ab5a338` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-60843f78-e863-4298-b57e-3168df913a26` |
| 6 | `POST /v1/auth/token` | 401 | 8 | `qa-a31961de-1882-41d4-b427-4bfda3de2115` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f0d63be0-68b4-44ec-a863-6942160f401c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0d63be0-68b4-44ec-a863-6942160f401c
Content-Type: application/json

--- request body ---
{"handle":"qa-e4cfcf1ed172","displayName":"QA e4cfcf1ed172","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0d63be0-68b4-44ec-a863-6942160f401c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-e4cfcf1ed172
X-Served-Region: eu
Content-Length: 181

{"id":"acc_231f7c02-7aad-4f0b-9f2a-fa9cc4fb2ca8","handle":"qa-e4cfcf1ed172","displayName":"QA e4cfcf1ed172","region":"eu","role":"user","createdAt":"2026-11-27T10:59:51.596892063Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-35a190ac-8980-4eb1-8dbe-f86a116cbc67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a190ac-8980-4eb1-8dbe-f86a116cbc67
Content-Type: application/json

--- request body ---
{"handle":"qa-e4cfcf1ed172","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-35a190ac-8980-4eb1-8dbe-f86a116cbc67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_231f7c02-7aad-4f0b-9f2a-fa9cc4fb2ca8"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-519f731c-f35c-4d27-992d-cbd40906ea66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-519f731c-f35c-4d27-992d-cbd40906ea66
Content-Type: application/json

--- response: 404 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-519f731c-f35c-4d27-992d-cbd40906ea66
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-519f731c-f35c-4d27-992d-cbd40906ea66"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-899552a2-b2bc-4611-9478-cccd8ab5a338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-899552a2-b2bc-4611-9478-cccd8ab5a338
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-899552a2-b2bc-4611-9478-cccd8ab5a338
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-899552a2-b2bc-4611-9478-cccd8ab5a338"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60843f78-e863-4298-b57e-3168df913a26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60843f78-e863-4298-b57e-3168df913a26
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60843f78-e863-4298-b57e-3168df913a26
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
correlation: qa-a31961de-1882-41d4-b427-4bfda3de2115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a31961de-1882-41d4-b427-4bfda3de2115
Content-Type: application/json

--- request body ---
{"handle":"qa-e4cfcf1ed172","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a31961de-1882-41d4-b427-4bfda3de2115
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a31961de-1882-41d4-b427-4bfda3de2115"}
```
