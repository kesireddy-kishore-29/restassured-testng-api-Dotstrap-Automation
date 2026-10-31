# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-a11953d0-1df7-4a5d-a3b9-ab75a53f1a90` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-970dc819-b59c-43c2-b78d-99be755a1ad3` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-64527fd7-12d9-4951-bfb7-50392587b597` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-7b048e04-116d-497f-b640-f2d9610a007e` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 14 | `qa-10c11bd8-1f07-4ad9-b1ca-2829b2321d84` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-5fd72d63-ac9d-45a1-82bd-ea3b1c1da082` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-ccc731c4-5e59-4a22-a3fd-71befa4b3aa0` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-2155080c-a4bb-4fbd-bf21-671293db8fc6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3b95ff68-5e78-4036-84d6-c54206ba5296` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-1539a514-b164-4ba7-9a77-5747b748b30e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a11953d0-1df7-4a5d-a3b9-ab75a53f1a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a11953d0-1df7-4a5d-a3b9-ab75a53f1a90
Content-Type: application/json

--- request body ---
{"handle":"qa-b9d20e445586","displayName":"QA b9d20e445586","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a11953d0-1df7-4a5d-a3b9-ab75a53f1a90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Location: /v1/accounts/qa-b9d20e445586
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fe2d8d6d-d5b9-49f0-b43d-ff9a171de8bc","handle":"qa-b9d20e445586","displayName":"QA b9d20e445586","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.024052054Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-970dc819-b59c-43c2-b78d-99be755a1ad3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-970dc819-b59c-43c2-b78d-99be755a1ad3
Content-Type: application/json

--- request body ---
{"handle":"qa-6d1393e23c93","displayName":"QA 6d1393e23c93","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-970dc819-b59c-43c2-b78d-99be755a1ad3
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
Location: /v1/accounts/qa-6d1393e23c93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_efe0056e-e57f-473b-b3c3-b27e5a881133","handle":"qa-6d1393e23c93","displayName":"QA 6d1393e23c93","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.056182768Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-64527fd7-12d9-4951-bfb7-50392587b597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64527fd7-12d9-4951-bfb7-50392587b597
Content-Type: application/json

--- request body ---
{"handle":"qa-b9d20e445586","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-64527fd7-12d9-4951-bfb7-50392587b597
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fe2d8d6d-d5b9-49f0-b43d-ff9a171de8bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7b048e04-116d-497f-b640-f2d9610a007e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b048e04-116d-497f-b640-f2d9610a007e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6d1393e23c93","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b048e04-116d-497f-b640-f2d9610a007e
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
Location: /v1/conversations/cnv_5743346f-f672-42d4-a8fa-6415a06b97fa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5743346f-f672-42d4-a8fa-6415a06b97fa","subject":"Error contract","status":"open","region":"eu","participants":["qa-b9d20e445586","qa-6d1393e23c93"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.100454624Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5743346f-f672-42d4-a8fa-6415a06b97fa/messages
correlation: qa-10c11bd8-1f07-4ad9-b1ca-2829b2321d84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10c11bd8-1f07-4ad9-b1ca-2829b2321d84
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10c11bd8-1f07-4ad9-b1ca-2829b2321d84
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_5743346f-f672-42d4-a8fa-6415a06b97fa/messages","correlationId":"qa-10c11bd8-1f07-4ad9-b1ca-2829b2321d84"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5fd72d63-ac9d-45a1-82bd-ea3b1c1da082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd72d63-ac9d-45a1-82bd-ea3b1c1da082
Content-Type: application/json

--- request body ---
{"handle":"qa-6d1393e23c93","password":"****"}

--- response: 200 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fd72d63-ac9d-45a1-82bd-ea3b1c1da082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_efe0056e-e57f-473b-b3c3-b27e5a881133"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccc731c4-5e59-4a22-a3fd-71befa4b3aa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc731c4-5e59-4a22-a3fd-71befa4b3aa0
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccc731c4-5e59-4a22-a3fd-71befa4b3aa0
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
correlation: qa-2155080c-a4bb-4fbd-bf21-671293db8fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2155080c-a4bb-4fbd-bf21-671293db8fc6
Content-Type: application/json

--- request body ---
{"handle":"qa-6d1393e23c93","password":"****"}

--- response: 401 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2155080c-a4bb-4fbd-bf21-671293db8fc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2155080c-a4bb-4fbd-bf21-671293db8fc6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3b95ff68-5e78-4036-84d6-c54206ba5296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b95ff68-5e78-4036-84d6-c54206ba5296
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3b95ff68-5e78-4036-84d6-c54206ba5296
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
correlation: qa-1539a514-b164-4ba7-9a77-5747b748b30e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1539a514-b164-4ba7-9a77-5747b748b30e
Content-Type: application/json

--- request body ---
{"handle":"qa-b9d20e445586","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1539a514-b164-4ba7-9a77-5747b748b30e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1539a514-b164-4ba7-9a77-5747b748b30e"}
```
