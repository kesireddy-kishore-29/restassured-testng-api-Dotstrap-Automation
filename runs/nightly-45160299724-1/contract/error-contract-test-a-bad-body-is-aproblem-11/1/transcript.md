# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-5b3fa9d7-4806-4f03-b968-dc6117fea29e` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-7f8d0c31-6cbc-4efa-8d5b-e70d2c1b7a13` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-9718a960-4071-46cf-8863-fe9f6935f209` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-6cccb332-f11c-41ba-8c64-fd67ad5cf6f3` |
| 5 | `POST /v1/conversations` | 422 | 14 | `qa-c7a89434-1828-46ac-8a9d-dce40a566a0b` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-34ee4ada-4b86-404f-9650-3724c4bdaaec` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-7ffc9acf-299a-475f-aba5-8d490506754b` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-a0da553f-1228-4c69-88cd-c1d34df78a65` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-22fb841f-b332-4dbf-9b4d-a8a1ccf94417` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-0328a86b-4c87-41a6-8652-caed5c0d40a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5b3fa9d7-4806-4f03-b968-dc6117fea29e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b3fa9d7-4806-4f03-b968-dc6117fea29e
Content-Type: application/json

--- request body ---
{"handle":"qa-3febc4bc7a5d","displayName":"QA 3febc4bc7a5d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b3fa9d7-4806-4f03-b968-dc6117fea29e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-3febc4bc7a5d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5017caad-223a-4e5c-b5c9-6d7fa2fbc0f2","handle":"qa-3febc4bc7a5d","displayName":"QA 3febc4bc7a5d","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.424600505Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7f8d0c31-6cbc-4efa-8d5b-e70d2c1b7a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f8d0c31-6cbc-4efa-8d5b-e70d2c1b7a13
Content-Type: application/json

--- request body ---
{"handle":"qa-63bcb643751f","displayName":"QA 63bcb643751f","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f8d0c31-6cbc-4efa-8d5b-e70d2c1b7a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-63bcb643751f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_49de61a3-35ee-4831-b4a8-1b6b4fbd696e","handle":"qa-63bcb643751f","displayName":"QA 63bcb643751f","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.458462015Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9718a960-4071-46cf-8863-fe9f6935f209

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9718a960-4071-46cf-8863-fe9f6935f209
Content-Type: application/json

--- request body ---
{"handle":"qa-3febc4bc7a5d","password":"****"}

--- response: 200 in 37 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9718a960-4071-46cf-8863-fe9f6935f209
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5017caad-223a-4e5c-b5c9-6d7fa2fbc0f2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6cccb332-f11c-41ba-8c64-fd67ad5cf6f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cccb332-f11c-41ba-8c64-fd67ad5cf6f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63bcb643751f","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6cccb332-f11c-41ba-8c64-fd67ad5cf6f3
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
Location: /v1/conversations/cnv_0fa30383-b1d7-4738-9775-b3034451f4c7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0fa30383-b1d7-4738-9775-b3034451f4c7","subject":"Error contract","status":"open","region":"eu","participants":["qa-3febc4bc7a5d","qa-63bcb643751f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:59.571951991Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-c7a89434-1828-46ac-8a9d-dce40a566a0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a89434-1828-46ac-8a9d-dce40a566a0b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-63bcb643751f","subject":" ","message":"Hi"}

--- response: 422 in 14 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7a89434-1828-46ac-8a9d-dce40a566a0b
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-c7a89434-1828-46ac-8a9d-dce40a566a0b","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34ee4ada-4b86-404f-9650-3724c4bdaaec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34ee4ada-4b86-404f-9650-3724c4bdaaec
Content-Type: application/json

--- request body ---
{"handle":"qa-63bcb643751f","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-34ee4ada-4b86-404f-9650-3724c4bdaaec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_49de61a3-35ee-4831-b4a8-1b6b4fbd696e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ffc9acf-299a-475f-aba5-8d490506754b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ffc9acf-299a-475f-aba5-8d490506754b
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ffc9acf-299a-475f-aba5-8d490506754b
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
correlation: qa-a0da553f-1228-4c69-88cd-c1d34df78a65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0da553f-1228-4c69-88cd-c1d34df78a65
Content-Type: application/json

--- request body ---
{"handle":"qa-63bcb643751f","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0da553f-1228-4c69-88cd-c1d34df78a65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0da553f-1228-4c69-88cd-c1d34df78a65"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22fb841f-b332-4dbf-9b4d-a8a1ccf94417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22fb841f-b332-4dbf-9b4d-a8a1ccf94417
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22fb841f-b332-4dbf-9b4d-a8a1ccf94417
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0328a86b-4c87-41a6-8652-caed5c0d40a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0328a86b-4c87-41a6-8652-caed5c0d40a9
Content-Type: application/json

--- request body ---
{"handle":"qa-3febc4bc7a5d","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0328a86b-4c87-41a6-8652-caed5c0d40a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0328a86b-4c87-41a6-8652-caed5c0d40a9"}
```
