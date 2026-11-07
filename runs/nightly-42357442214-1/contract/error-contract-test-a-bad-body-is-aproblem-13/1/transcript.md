# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-056f8916-16f2-431b-a90d-d66cd1913995` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-b2a91b22-6a14-4fdd-9bbc-cfda06bd566b` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-25f3685e-14c9-4d22-89d0-51fe0ee8ae6f` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-04eacef9-ca3e-43a5-94f9-17b75b0d29c2` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 12 | `qa-2a0c104f-d778-4219-93c8-1eee70249249` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-569cf4c3-ddaa-4198-a803-c90030a4c866` |
| 7 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-6e9b8ebc-dbda-459c-a1dd-9e5082c25036` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-4787ad47-da5d-4b46-b054-5a427d59b338` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-e8a84a22-6609-4f4a-b692-68fa25c67ced` |
| 10 | `POST /v1/auth/token` | 401 | 38 | `qa-2c63a97d-d61c-4bb8-8259-65ace07f10d7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-056f8916-16f2-431b-a90d-d66cd1913995

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-056f8916-16f2-431b-a90d-d66cd1913995
Content-Type: application/json

--- request body ---
{"handle":"qa-1c68e812cbf3","displayName":"QA 1c68e812cbf3","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-056f8916-16f2-431b-a90d-d66cd1913995
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-1c68e812cbf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3153c355-f680-4439-b090-62928a350f78","handle":"qa-1c68e812cbf3","displayName":"QA 1c68e812cbf3","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.246241138Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b2a91b22-6a14-4fdd-9bbc-cfda06bd566b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a91b22-6a14-4fdd-9bbc-cfda06bd566b
Content-Type: application/json

--- request body ---
{"handle":"qa-587947f389e1","displayName":"QA 587947f389e1","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2a91b22-6a14-4fdd-9bbc-cfda06bd566b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 8
Location: /v1/accounts/qa-587947f389e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fba910f1-124b-4e50-9a7e-ddba175427cd","handle":"qa-587947f389e1","displayName":"QA 587947f389e1","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.270604975Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-25f3685e-14c9-4d22-89d0-51fe0ee8ae6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25f3685e-14c9-4d22-89d0-51fe0ee8ae6f
Content-Type: application/json

--- request body ---
{"handle":"qa-1c68e812cbf3","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-25f3685e-14c9-4d22-89d0-51fe0ee8ae6f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3153c355-f680-4439-b090-62928a350f78"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-04eacef9-ca3e-43a5-94f9-17b75b0d29c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04eacef9-ca3e-43a5-94f9-17b75b0d29c2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-587947f389e1","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-04eacef9-ca3e-43a5-94f9-17b75b0d29c2
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
Location: /v1/conversations/cnv_aceab8c2-6f1f-4c66-9591-edf14abae91d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aceab8c2-6f1f-4c66-9591-edf14abae91d","subject":"Error contract","status":"open","region":"eu","participants":["qa-1c68e812cbf3","qa-587947f389e1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.306053409Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_aceab8c2-6f1f-4c66-9591-edf14abae91d/messages
correlation: qa-2a0c104f-d778-4219-93c8-1eee70249249

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a0c104f-d778-4219-93c8-1eee70249249
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a0c104f-d778-4219-93c8-1eee70249249
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_aceab8c2-6f1f-4c66-9591-edf14abae91d/messages","correlationId":"qa-2a0c104f-d778-4219-93c8-1eee70249249"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-569cf4c3-ddaa-4198-a803-c90030a4c866

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-569cf4c3-ddaa-4198-a803-c90030a4c866
Content-Type: application/json

--- request body ---
{"handle":"qa-587947f389e1","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-569cf4c3-ddaa-4198-a803-c90030a4c866
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fba910f1-124b-4e50-9a7e-ddba175427cd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e9b8ebc-dbda-459c-a1dd-9e5082c25036

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e9b8ebc-dbda-459c-a1dd-9e5082c25036
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e9b8ebc-dbda-459c-a1dd-9e5082c25036
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
correlation: qa-4787ad47-da5d-4b46-b054-5a427d59b338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4787ad47-da5d-4b46-b054-5a427d59b338
Content-Type: application/json

--- request body ---
{"handle":"qa-587947f389e1","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4787ad47-da5d-4b46-b054-5a427d59b338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4787ad47-da5d-4b46-b054-5a427d59b338"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8a84a22-6609-4f4a-b692-68fa25c67ced

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8a84a22-6609-4f4a-b692-68fa25c67ced
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8a84a22-6609-4f4a-b692-68fa25c67ced
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
correlation: qa-2c63a97d-d61c-4bb8-8259-65ace07f10d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c63a97d-d61c-4bb8-8259-65ace07f10d7
Content-Type: application/json

--- request body ---
{"handle":"qa-1c68e812cbf3","password":"****"}

--- response: 401 in 38 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c63a97d-d61c-4bb8-8259-65ace07f10d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c63a97d-d61c-4bb8-8259-65ace07f10d7"}
```
