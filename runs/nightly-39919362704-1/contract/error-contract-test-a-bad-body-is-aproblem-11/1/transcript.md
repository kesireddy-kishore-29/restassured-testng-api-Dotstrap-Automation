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
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-7d0a5ba0-90c4-4ac2-90eb-c32f18c67ffd` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-b413b211-6e84-4739-9181-e0e724d74743` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-d7d57251-e74c-40b0-adcf-f2e30403fbc5` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-b5dbc039-5cec-47aa-85ab-4e7ff4e2ea13` |
| 5 | `POST /v1/conversations` | 422 | 14 | `qa-ff6cfc61-1a70-49a9-870f-c4ba1ca94cc7` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-bd1275a6-ce7b-4c2a-9844-03b03b02f038` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-60dbb2f5-e91c-4c1c-9bbb-0026be562c08` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-34c1d99a-f778-4fad-80f1-5772881277c8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-7e9ec2ab-5836-4153-b58b-542ef075b19e` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-ea888692-6ed5-4e2b-8da1-825983dfff8b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7d0a5ba0-90c4-4ac2-90eb-c32f18c67ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d0a5ba0-90c4-4ac2-90eb-c32f18c67ffd
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe2f7924551","displayName":"QA 0fe2f7924551","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d0a5ba0-90c4-4ac2-90eb-c32f18c67ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Location: /v1/accounts/qa-0fe2f7924551
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5197773d-946b-4b68-82da-8dea336c455c","handle":"qa-0fe2f7924551","displayName":"QA 0fe2f7924551","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.165060327Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b413b211-6e84-4739-9181-e0e724d74743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b413b211-6e84-4739-9181-e0e724d74743
Content-Type: application/json

--- request body ---
{"handle":"qa-cf49591b2fd7","displayName":"QA cf49591b2fd7","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b413b211-6e84-4739-9181-e0e724d74743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 7
Location: /v1/accounts/qa-cf49591b2fd7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9bd09803-4470-4ccd-809f-863ff1c1781f","handle":"qa-cf49591b2fd7","displayName":"QA cf49591b2fd7","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.229373331Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d7d57251-e74c-40b0-adcf-f2e30403fbc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7d57251-e74c-40b0-adcf-f2e30403fbc5
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe2f7924551","password":"****"}

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7d57251-e74c-40b0-adcf-f2e30403fbc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5197773d-946b-4b68-82da-8dea336c455c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b5dbc039-5cec-47aa-85ab-4e7ff4e2ea13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5dbc039-5cec-47aa-85ab-4e7ff4e2ea13
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf49591b2fd7","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5dbc039-5cec-47aa-85ab-4e7ff4e2ea13
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
Location: /v1/conversations/cnv_fe51ac11-b351-406d-a829-f6e2b4f40c4e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fe51ac11-b351-406d-a829-f6e2b4f40c4e","subject":"Error contract","status":"open","region":"eu","participants":["qa-0fe2f7924551","qa-cf49591b2fd7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.357182620Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ff6cfc61-1a70-49a9-870f-c4ba1ca94cc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6cfc61-1a70-49a9-870f-c4ba1ca94cc7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cf49591b2fd7","subject":" ","message":"Hi"}

--- response: 422 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff6cfc61-1a70-49a9-870f-c4ba1ca94cc7
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-ff6cfc61-1a70-49a9-870f-c4ba1ca94cc7","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bd1275a6-ce7b-4c2a-9844-03b03b02f038

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd1275a6-ce7b-4c2a-9844-03b03b02f038
Content-Type: application/json

--- request body ---
{"handle":"qa-cf49591b2fd7","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd1275a6-ce7b-4c2a-9844-03b03b02f038
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9bd09803-4470-4ccd-809f-863ff1c1781f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60dbb2f5-e91c-4c1c-9bbb-0026be562c08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60dbb2f5-e91c-4c1c-9bbb-0026be562c08
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60dbb2f5-e91c-4c1c-9bbb-0026be562c08
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
correlation: qa-34c1d99a-f778-4fad-80f1-5772881277c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34c1d99a-f778-4fad-80f1-5772881277c8
Content-Type: application/json

--- request body ---
{"handle":"qa-cf49591b2fd7","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34c1d99a-f778-4fad-80f1-5772881277c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-34c1d99a-f778-4fad-80f1-5772881277c8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e9ec2ab-5836-4153-b58b-542ef075b19e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9ec2ab-5836-4153-b58b-542ef075b19e
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e9ec2ab-5836-4153-b58b-542ef075b19e
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
correlation: qa-ea888692-6ed5-4e2b-8da1-825983dfff8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea888692-6ed5-4e2b-8da1-825983dfff8b
Content-Type: application/json

--- request body ---
{"handle":"qa-0fe2f7924551","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea888692-6ed5-4e2b-8da1-825983dfff8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ea888692-6ed5-4e2b-8da1-825983dfff8b"}
```
