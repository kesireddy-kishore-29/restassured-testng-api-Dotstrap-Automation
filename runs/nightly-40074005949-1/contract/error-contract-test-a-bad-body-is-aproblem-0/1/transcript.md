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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-827c7d25-9383-4598-a7ff-c8cbb9ca148e` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-260d159b-fe54-41c2-8484-161debfa8082` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-ab7a99b0-4a99-404f-b552-2395d3e50645` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-8fc7fce7-aedd-48e0-8830-c0da3c8aae2a` |
| 5 | `POST /v1/auth/token` | 400 | 18 | `qa-0c0b9b13-2e26-4249-9515-5c61ddf4b39d` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-e4ce52c5-734c-423d-ad50-c8cb86f874bc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-9911f9bc-44e9-4a81-9746-0e7b6309092a` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-a5d0bd74-e00a-48f2-90ed-1c43a33f28b0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-d3d5bc61-2c0b-442b-9e4c-b0481ecb8950` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-f3f686cf-c07b-4777-84cb-b88f6f457e80` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-827c7d25-9383-4598-a7ff-c8cbb9ca148e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-827c7d25-9383-4598-a7ff-c8cbb9ca148e
Content-Type: application/json

--- request body ---
{"handle":"qa-2fab5849ab78","displayName":"QA 2fab5849ab78","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-827c7d25-9383-4598-a7ff-c8cbb9ca148e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 10
Location: /v1/accounts/qa-2fab5849ab78
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b97d2e7-b622-4ef8-8667-c30ab07b2e33","handle":"qa-2fab5849ab78","displayName":"QA 2fab5849ab78","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.803307410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-260d159b-fe54-41c2-8484-161debfa8082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-260d159b-fe54-41c2-8484-161debfa8082
Content-Type: application/json

--- request body ---
{"handle":"qa-07b85a0e02a1","displayName":"QA 07b85a0e02a1","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-260d159b-fe54-41c2-8484-161debfa8082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 10
Location: /v1/accounts/qa-07b85a0e02a1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bb2eb9e2-a431-433e-8d96-68866eae099b","handle":"qa-07b85a0e02a1","displayName":"QA 07b85a0e02a1","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.855125096Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ab7a99b0-4a99-404f-b552-2395d3e50645

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7a99b0-4a99-404f-b552-2395d3e50645
Content-Type: application/json

--- request body ---
{"handle":"qa-2fab5849ab78","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab7a99b0-4a99-404f-b552-2395d3e50645
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b97d2e7-b622-4ef8-8667-c30ab07b2e33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8fc7fce7-aedd-48e0-8830-c0da3c8aae2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fc7fce7-aedd-48e0-8830-c0da3c8aae2a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-07b85a0e02a1","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fc7fce7-aedd-48e0-8830-c0da3c8aae2a
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
Location: /v1/conversations/cnv_2d4ed705-6bf0-462b-843d-1dc4931a61a0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2d4ed705-6bf0-462b-843d-1dc4931a61a0","subject":"Error contract","status":"open","region":"eu","participants":["qa-2fab5849ab78","qa-07b85a0e02a1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:01.970183524Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-0c0b9b13-2e26-4249-9515-5c61ddf4b39d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c0b9b13-2e26-4249-9515-5c61ddf4b39d
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c0b9b13-2e26-4249-9515-5c61ddf4b39d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-0c0b9b13-2e26-4249-9515-5c61ddf4b39d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e4ce52c5-734c-423d-ad50-c8cb86f874bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ce52c5-734c-423d-ad50-c8cb86f874bc
Content-Type: application/json

--- request body ---
{"handle":"qa-07b85a0e02a1","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4ce52c5-734c-423d-ad50-c8cb86f874bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bb2eb9e2-a431-433e-8d96-68866eae099b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9911f9bc-44e9-4a81-9746-0e7b6309092a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9911f9bc-44e9-4a81-9746-0e7b6309092a
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9911f9bc-44e9-4a81-9746-0e7b6309092a
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
correlation: qa-a5d0bd74-e00a-48f2-90ed-1c43a33f28b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5d0bd74-e00a-48f2-90ed-1c43a33f28b0
Content-Type: application/json

--- request body ---
{"handle":"qa-07b85a0e02a1","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5d0bd74-e00a-48f2-90ed-1c43a33f28b0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5d0bd74-e00a-48f2-90ed-1c43a33f28b0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d3d5bc61-2c0b-442b-9e4c-b0481ecb8950

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3d5bc61-2c0b-442b-9e4c-b0481ecb8950
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d3d5bc61-2c0b-442b-9e4c-b0481ecb8950
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
correlation: qa-f3f686cf-c07b-4777-84cb-b88f6f457e80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3f686cf-c07b-4777-84cb-b88f6f457e80
Content-Type: application/json

--- request body ---
{"handle":"qa-2fab5849ab78","password":"****"}

--- response: 401 in 20 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3f686cf-c07b-4777-84cb-b88f6f457e80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3f686cf-c07b-4777-84cb-b88f6f457e80"}
```
