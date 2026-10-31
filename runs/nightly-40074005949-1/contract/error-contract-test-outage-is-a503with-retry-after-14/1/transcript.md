# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-f84d78be-7e5f-453d-b8f3-b8b45b9def2e` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-b6d16644-f496-4a8a-b2cb-d46cdb87d792` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-6446733f-8ff7-41b7-a8af-8741a5cda8b5` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-fa351520-a53b-41e9-acd1-58957f5a1e25` |
| 5 | `GET /v1/credits/ledger` | 503 | 7 | `qa-230ba336-0e98-45c8-8483-465371978bbd` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-9cdfc768-242e-4048-b1ed-e352657b33cd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-dd3869df-3d1d-4a6d-b23f-356d356fe8e9` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-cca45b0b-9005-4c4b-b5e4-bd98890943af` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-28e065f7-0d79-4fd7-8404-213f3d62709d` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-8529a6cd-7ae1-4b92-b498-009e22183bfc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f84d78be-7e5f-453d-b8f3-b8b45b9def2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f84d78be-7e5f-453d-b8f3-b8b45b9def2e
Content-Type: application/json

--- request body ---
{"handle":"qa-fe81586b0e05","displayName":"QA fe81586b0e05","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f84d78be-7e5f-453d-b8f3-b8b45b9def2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Location: /v1/accounts/qa-fe81586b0e05
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81833128-9e41-4f4b-b9a1-f8a72ee04b26","handle":"qa-fe81586b0e05","displayName":"QA fe81586b0e05","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.670934472Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b6d16644-f496-4a8a-b2cb-d46cdb87d792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6d16644-f496-4a8a-b2cb-d46cdb87d792
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2bf5e6724e","displayName":"QA 3d2bf5e6724e","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6d16644-f496-4a8a-b2cb-d46cdb87d792
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 8
Location: /v1/accounts/qa-3d2bf5e6724e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f98a870d-bd98-49d1-83ba-8959ecb0067b","handle":"qa-3d2bf5e6724e","displayName":"QA 3d2bf5e6724e","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.702963044Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6446733f-8ff7-41b7-a8af-8741a5cda8b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6446733f-8ff7-41b7-a8af-8741a5cda8b5
Content-Type: application/json

--- request body ---
{"handle":"qa-fe81586b0e05","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6446733f-8ff7-41b7-a8af-8741a5cda8b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81833128-9e41-4f4b-b9a1-f8a72ee04b26"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-fa351520-a53b-41e9-acd1-58957f5a1e25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa351520-a53b-41e9-acd1-58957f5a1e25
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3d2bf5e6724e","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fa351520-a53b-41e9-acd1-58957f5a1e25
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
Location: /v1/conversations/cnv_fb1989fc-a761-4c35-a39a-77fff310b70c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb1989fc-a761-4c35-a39a-77fff310b70c","subject":"Error contract","status":"open","region":"eu","participants":["qa-fe81586b0e05","qa-3d2bf5e6724e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.755987280Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-230ba336-0e98-45c8-8483-465371978bbd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 70b2c8b6-422f-43f4-8d62-c3e9f4eeeb6e
X-Correlation-Id: qa-230ba336-0e98-45c8-8483-465371978bbd
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-230ba336-0e98-45c8-8483-465371978bbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-230ba336-0e98-45c8-8483-465371978bbd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9cdfc768-242e-4048-b1ed-e352657b33cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cdfc768-242e-4048-b1ed-e352657b33cd
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2bf5e6724e","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cdfc768-242e-4048-b1ed-e352657b33cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f98a870d-bd98-49d1-83ba-8959ecb0067b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd3869df-3d1d-4a6d-b23f-356d356fe8e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd3869df-3d1d-4a6d-b23f-356d356fe8e9
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd3869df-3d1d-4a6d-b23f-356d356fe8e9
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-cca45b0b-9005-4c4b-b5e4-bd98890943af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cca45b0b-9005-4c4b-b5e4-bd98890943af
Content-Type: application/json

--- request body ---
{"handle":"qa-3d2bf5e6724e","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cca45b0b-9005-4c4b-b5e4-bd98890943af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cca45b0b-9005-4c4b-b5e4-bd98890943af"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-28e065f7-0d79-4fd7-8404-213f3d62709d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e065f7-0d79-4fd7-8404-213f3d62709d
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-28e065f7-0d79-4fd7-8404-213f3d62709d
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8529a6cd-7ae1-4b92-b498-009e22183bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8529a6cd-7ae1-4b92-b498-009e22183bfc
Content-Type: application/json

--- request body ---
{"handle":"qa-fe81586b0e05","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8529a6cd-7ae1-4b92-b498-009e22183bfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8529a6cd-7ae1-4b92-b498-009e22183bfc"}
```
