# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-fe1972ca-cf38-4079-b8ae-532ab78e15b3` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-f94b4e7e-d77b-423f-a80e-af9aabe6ca7d` |
| 3 | `POST /v1/auth/token` | 200 | 38 | `qa-704792e2-9278-4f97-b274-d86cde685662` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-b3ff8d8b-23c1-448c-8b75-b0a98f498493` |
| 5 | `POST /v1/auth/token` | 400 | 11 | `qa-d147dfd0-6f1d-477a-bd9c-3c5a4dda5261` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-924b8de0-3b6f-48e8-9363-7a42b5f54ae1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-a5c7df24-c74e-480a-8825-e6761446ef5d` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-f7df8a24-03e9-4f9e-bda0-834579c2309c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-1e774539-a696-437b-81e4-5b9c054c7db4` |
| 10 | `POST /v1/auth/token` | 401 | 25 | `qa-48eb9fdc-39c2-4a04-af63-c27a9bd52072` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fe1972ca-cf38-4079-b8ae-532ab78e15b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe1972ca-cf38-4079-b8ae-532ab78e15b3
Content-Type: application/json

--- request body ---
{"handle":"qa-48c717811ee0","displayName":"QA 48c717811ee0","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe1972ca-cf38-4079-b8ae-532ab78e15b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-48c717811ee0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12e7a4cf-fd75-4425-bfa9-e8fea9dbbb6c","handle":"qa-48c717811ee0","displayName":"QA 48c717811ee0","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.329609373Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f94b4e7e-d77b-423f-a80e-af9aabe6ca7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94b4e7e-d77b-423f-a80e-af9aabe6ca7d
Content-Type: application/json

--- request body ---
{"handle":"qa-1d652168ae0e","displayName":"QA 1d652168ae0e","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f94b4e7e-d77b-423f-a80e-af9aabe6ca7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-1d652168ae0e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5fd0204e-7bee-4543-99f8-2129f803a854","handle":"qa-1d652168ae0e","displayName":"QA 1d652168ae0e","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.381721025Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-704792e2-9278-4f97-b274-d86cde685662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704792e2-9278-4f97-b274-d86cde685662
Content-Type: application/json

--- request body ---
{"handle":"qa-48c717811ee0","password":"****"}

--- response: 200 in 38 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-704792e2-9278-4f97-b274-d86cde685662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12e7a4cf-fd75-4425-bfa9-e8fea9dbbb6c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b3ff8d8b-23c1-448c-8b75-b0a98f498493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3ff8d8b-23c1-448c-8b75-b0a98f498493
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1d652168ae0e","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3ff8d8b-23c1-448c-8b75-b0a98f498493
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
Location: /v1/conversations/cnv_64a44382-9a8e-436c-bd62-6941e64b067d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_64a44382-9a8e-436c-bd62-6941e64b067d","subject":"Error contract","status":"open","region":"eu","participants":["qa-48c717811ee0","qa-1d652168ae0e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.450722556Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d147dfd0-6f1d-477a-bd9c-3c5a4dda5261

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d147dfd0-6f1d-477a-bd9c-3c5a4dda5261
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d147dfd0-6f1d-477a-bd9c-3c5a4dda5261
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-d147dfd0-6f1d-477a-bd9c-3c5a4dda5261"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-924b8de0-3b6f-48e8-9363-7a42b5f54ae1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-924b8de0-3b6f-48e8-9363-7a42b5f54ae1
Content-Type: application/json

--- request body ---
{"handle":"qa-1d652168ae0e","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-924b8de0-3b6f-48e8-9363-7a42b5f54ae1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5fd0204e-7bee-4543-99f8-2129f803a854"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5c7df24-c74e-480a-8825-e6761446ef5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5c7df24-c74e-480a-8825-e6761446ef5d
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5c7df24-c74e-480a-8825-e6761446ef5d
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
correlation: qa-f7df8a24-03e9-4f9e-bda0-834579c2309c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7df8a24-03e9-4f9e-bda0-834579c2309c
Content-Type: application/json

--- request body ---
{"handle":"qa-1d652168ae0e","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f7df8a24-03e9-4f9e-bda0-834579c2309c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f7df8a24-03e9-4f9e-bda0-834579c2309c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e774539-a696-437b-81e4-5b9c054c7db4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e774539-a696-437b-81e4-5b9c054c7db4
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e774539-a696-437b-81e4-5b9c054c7db4
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
correlation: qa-48eb9fdc-39c2-4a04-af63-c27a9bd52072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48eb9fdc-39c2-4a04-af63-c27a9bd52072
Content-Type: application/json

--- request body ---
{"handle":"qa-48c717811ee0","password":"****"}

--- response: 401 in 25 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48eb9fdc-39c2-4a04-af63-c27a9bd52072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48eb9fdc-39c2-4a04-af63-c27a9bd52072"}
```
