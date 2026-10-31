# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 54 | `qa-3c40ed12-9f04-4b28-a7ac-8eef02f0cd94` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-592dc886-5ab9-4991-9942-2bfabeda673d` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-4fbeae73-d708-42f2-aad8-0a931cea0de1` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-52518df8-e4d7-48aa-8009-2e08ef134742` |
| 5 | `POST /v1/auth/token` | 422 | 65 | `qa-ac924c0b-a9ef-44e9-8a03-717c14d4e754` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-8d19c7e7-0287-491e-9249-3ef968c2dd12` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-f410d86a-fd8b-4343-a9de-637fa9d56aeb` |
| 8 | `POST /v1/auth/token` | 401 | 38 | `qa-03de2484-b15a-4876-b590-6ba14feadedb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-22688f31-1d2e-48a9-966c-2474ebbbff93` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-0b83fdc7-b791-4863-8704-d03c74346a7a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3c40ed12-9f04-4b28-a7ac-8eef02f0cd94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c40ed12-9f04-4b28-a7ac-8eef02f0cd94
Content-Type: application/json

--- request body ---
{"handle":"qa-cd6e37203dac","displayName":"QA cd6e37203dac","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c40ed12-9f04-4b28-a7ac-8eef02f0cd94
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
Location: /v1/accounts/qa-cd6e37203dac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7ea8f897-d9d7-4c5b-8641-8c09b7540c35","handle":"qa-cd6e37203dac","displayName":"QA cd6e37203dac","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.743089226Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-592dc886-5ab9-4991-9942-2bfabeda673d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-592dc886-5ab9-4991-9942-2bfabeda673d
Content-Type: application/json

--- request body ---
{"handle":"qa-1165fe596f9b","displayName":"QA 1165fe596f9b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-592dc886-5ab9-4991-9942-2bfabeda673d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-1165fe596f9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1cb1182-00ec-4754-910e-3a403af97b6e","handle":"qa-1165fe596f9b","displayName":"QA 1165fe596f9b","region":"eu","role":"user","createdAt":"2026-10-23T07:41:43.791396057Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4fbeae73-d708-42f2-aad8-0a931cea0de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fbeae73-d708-42f2-aad8-0a931cea0de1
Content-Type: application/json

--- request body ---
{"handle":"qa-cd6e37203dac","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fbeae73-d708-42f2-aad8-0a931cea0de1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7ea8f897-d9d7-4c5b-8641-8c09b7540c35"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-52518df8-e4d7-48aa-8009-2e08ef134742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52518df8-e4d7-48aa-8009-2e08ef134742
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1165fe596f9b","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-52518df8-e4d7-48aa-8009-2e08ef134742
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
Location: /v1/conversations/cnv_9c4972e4-9d6b-4663-87da-68f723777c29
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_9c4972e4-9d6b-4663-87da-68f723777c29","subject":"Error contract","status":"open","region":"eu","participants":["qa-cd6e37203dac","qa-1165fe596f9b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:43.870655142Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ac924c0b-a9ef-44e9-8a03-717c14d4e754

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac924c0b-a9ef-44e9-8a03-717c14d4e754
Content-Type: application/json

--- request body ---
{"handle":"qa-cd6e37203dac","password":"****","ttlSeconds":0}

--- response: 422 in 65 ms ---
Date: Fri, 23 Oct 2026 07:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac924c0b-a9ef-44e9-8a03-717c14d4e754
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-ac924c0b-a9ef-44e9-8a03-717c14d4e754","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8d19c7e7-0287-491e-9249-3ef968c2dd12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d19c7e7-0287-491e-9249-3ef968c2dd12
Content-Type: application/json

--- request body ---
{"handle":"qa-1165fe596f9b","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d19c7e7-0287-491e-9249-3ef968c2dd12
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1cb1182-00ec-4754-910e-3a403af97b6e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f410d86a-fd8b-4343-a9de-637fa9d56aeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f410d86a-fd8b-4343-a9de-637fa9d56aeb
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f410d86a-fd8b-4343-a9de-637fa9d56aeb
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
correlation: qa-03de2484-b15a-4876-b590-6ba14feadedb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03de2484-b15a-4876-b590-6ba14feadedb
Content-Type: application/json

--- request body ---
{"handle":"qa-1165fe596f9b","password":"****"}

--- response: 401 in 38 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03de2484-b15a-4876-b590-6ba14feadedb
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03de2484-b15a-4876-b590-6ba14feadedb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-22688f31-1d2e-48a9-966c-2474ebbbff93

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22688f31-1d2e-48a9-966c-2474ebbbff93
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-22688f31-1d2e-48a9-966c-2474ebbbff93
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
correlation: qa-0b83fdc7-b791-4863-8704-d03c74346a7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b83fdc7-b791-4863-8704-d03c74346a7a
Content-Type: application/json

--- request body ---
{"handle":"qa-cd6e37203dac","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b83fdc7-b791-4863-8704-d03c74346a7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b83fdc7-b791-4863-8704-d03c74346a7a"}
```
