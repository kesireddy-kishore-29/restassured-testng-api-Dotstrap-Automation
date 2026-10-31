# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-e1c19810-9c21-4cc5-a8ca-ca1bce3ff168` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-97660420-c1ce-43be-9f7b-7c1f91e46b15` |
| 3 | `POST /v1/auth/token` | 200 | 41 | `qa-f80d1c02-053a-4ed7-9550-2fc978cca17e` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-b354c80a-8a4d-4582-99bd-dedcbaf681ab` |
| 5 | `POST /v1/auth/token` | 415 | 86 | `qa-f430ab13-39c6-4ec4-a9b1-1aa5b91604d8` |
| 6 | `POST /v1/auth/token` | 200 | 46 | `qa-5abd05bb-7c9b-45d5-8a0c-aa9e1b8f2678` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-8b75b37d-d039-4fd4-9de7-15360375e6ce` |
| 8 | `POST /v1/auth/token` | 401 | 47 | `qa-e9bbe7c3-c7c4-49cf-980c-c32c8801b582` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-fc6241df-a7e7-444e-9f08-ed3859c471bb` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-32b95a6c-da73-4c5d-89de-9c1f89c881ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e1c19810-9c21-4cc5-a8ca-ca1bce3ff168

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c19810-9c21-4cc5-a8ca-ca1bce3ff168
Content-Type: application/json

--- request body ---
{"handle":"qa-cafc0f900479","displayName":"QA cafc0f900479","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1c19810-9c21-4cc5-a8ca-ca1bce3ff168
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-cafc0f900479
X-Served-Region: eu
Content-Length: 181

{"id":"acc_44b9e9a9-a6a4-47e0-bd66-5d9e1f6d6aa7","handle":"qa-cafc0f900479","displayName":"QA cafc0f900479","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.430787568Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-97660420-c1ce-43be-9f7b-7c1f91e46b15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97660420-c1ce-43be-9f7b-7c1f91e46b15
Content-Type: application/json

--- request body ---
{"handle":"qa-1176db34d56c","displayName":"QA 1176db34d56c","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-97660420-c1ce-43be-9f7b-7c1f91e46b15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-1176db34d56c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34b3abe6-710e-41d4-bd09-92ed74fb525c","handle":"qa-1176db34d56c","displayName":"QA 1176db34d56c","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.482171077Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f80d1c02-053a-4ed7-9550-2fc978cca17e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80d1c02-053a-4ed7-9550-2fc978cca17e
Content-Type: application/json

--- request body ---
{"handle":"qa-cafc0f900479","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f80d1c02-053a-4ed7-9550-2fc978cca17e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_44b9e9a9-a6a4-47e0-bd66-5d9e1f6d6aa7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b354c80a-8a4d-4582-99bd-dedcbaf681ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b354c80a-8a4d-4582-99bd-dedcbaf681ab
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1176db34d56c","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b354c80a-8a4d-4582-99bd-dedcbaf681ab
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
Location: /v1/conversations/cnv_d8e0acd1-fe59-4eb7-9d28-e81eceaffcb4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d8e0acd1-fe59-4eb7-9d28-e81eceaffcb4","subject":"Error contract","status":"open","region":"eu","participants":["qa-cafc0f900479","qa-1176db34d56c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.581691456Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f430ab13-39c6-4ec4-a9b1-1aa5b91604d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f430ab13-39c6-4ec4-a9b1-1aa5b91604d8
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 86 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f430ab13-39c6-4ec4-a9b1-1aa5b91604d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-f430ab13-39c6-4ec4-a9b1-1aa5b91604d8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5abd05bb-7c9b-45d5-8a0c-aa9e1b8f2678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5abd05bb-7c9b-45d5-8a0c-aa9e1b8f2678
Content-Type: application/json

--- request body ---
{"handle":"qa-1176db34d56c","password":"****"}

--- response: 200 in 46 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-5abd05bb-7c9b-45d5-8a0c-aa9e1b8f2678
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34b3abe6-710e-41d4-bd09-92ed74fb525c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b75b37d-d039-4fd4-9de7-15360375e6ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b75b37d-d039-4fd4-9de7-15360375e6ce
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b75b37d-d039-4fd4-9de7-15360375e6ce
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
correlation: qa-e9bbe7c3-c7c4-49cf-980c-c32c8801b582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9bbe7c3-c7c4-49cf-980c-c32c8801b582
Content-Type: application/json

--- request body ---
{"handle":"qa-1176db34d56c","password":"****"}

--- response: 401 in 47 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9bbe7c3-c7c4-49cf-980c-c32c8801b582
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9bbe7c3-c7c4-49cf-980c-c32c8801b582"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc6241df-a7e7-444e-9f08-ed3859c471bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc6241df-a7e7-444e-9f08-ed3859c471bb
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc6241df-a7e7-444e-9f08-ed3859c471bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-32b95a6c-da73-4c5d-89de-9c1f89c881ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b95a6c-da73-4c5d-89de-9c1f89c881ba
Content-Type: application/json

--- request body ---
{"handle":"qa-cafc0f900479","password":"****"}

--- response: 401 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32b95a6c-da73-4c5d-89de-9c1f89c881ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32b95a6c-da73-4c5d-89de-9c1f89c881ba"}
```
