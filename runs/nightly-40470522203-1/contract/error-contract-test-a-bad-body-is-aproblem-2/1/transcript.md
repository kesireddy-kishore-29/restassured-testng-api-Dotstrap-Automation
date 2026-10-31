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
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-1e89e472-5dd5-4793-97d4-1819698f5cfb` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-a360ae50-f069-42c0-9ee6-459a1c4c5c3a` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-8ebd8658-ee20-447d-82d0-89171889d388` |
| 4 | `POST /v1/conversations` | 201 | 50 | `qa-603a4eac-7c5d-4745-ac58-9bb05e2a4092` |
| 5 | `POST /v1/auth/token` | 422 | 53 | `qa-c5b32a71-cca0-4455-aee8-d502115c3633` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-f9e17fed-73d2-4042-86cc-b30e9d055105` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-f73b8074-d286-45b7-ace0-ca015d8983bf` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-172b963c-4f77-4d89-9d84-c787706e198c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-d01406d4-a093-440d-8396-4d906a87055c` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-106768be-9cbe-4ec6-8ece-62b53b893d56` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1e89e472-5dd5-4793-97d4-1819698f5cfb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e89e472-5dd5-4793-97d4-1819698f5cfb
Content-Type: application/json

--- request body ---
{"handle":"qa-817f08938e03","displayName":"QA 817f08938e03","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e89e472-5dd5-4793-97d4-1819698f5cfb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-817f08938e03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_837aeef2-a4cb-4b1b-9c59-efb63f079807","handle":"qa-817f08938e03","displayName":"QA 817f08938e03","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.434089716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a360ae50-f069-42c0-9ee6-459a1c4c5c3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a360ae50-f069-42c0-9ee6-459a1c4c5c3a
Content-Type: application/json

--- request body ---
{"handle":"qa-b36b0076b921","displayName":"QA b36b0076b921","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a360ae50-f069-42c0-9ee6-459a1c4c5c3a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Location: /v1/accounts/qa-b36b0076b921
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1c168c66-c745-411a-9d43-d631309255cd","handle":"qa-b36b0076b921","displayName":"QA b36b0076b921","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.489807033Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8ebd8658-ee20-447d-82d0-89171889d388

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ebd8658-ee20-447d-82d0-89171889d388
Content-Type: application/json

--- request body ---
{"handle":"qa-817f08938e03","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ebd8658-ee20-447d-82d0-89171889d388
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_837aeef2-a4cb-4b1b-9c59-efb63f079807"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-603a4eac-7c5d-4745-ac58-9bb05e2a4092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-603a4eac-7c5d-4745-ac58-9bb05e2a4092
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b36b0076b921","subject":"Error contract","message":"Hi"}

--- response: 201 in 50 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-603a4eac-7c5d-4745-ac58-9bb05e2a4092
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
Location: /v1/conversations/cnv_38b64558-0e19-43dd-ac3a-ed8a3c17242e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_38b64558-0e19-43dd-ac3a-ed8a3c17242e","subject":"Error contract","status":"open","region":"eu","participants":["qa-817f08938e03","qa-b36b0076b921"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.616469788Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c5b32a71-cca0-4455-aee8-d502115c3633

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b32a71-cca0-4455-aee8-d502115c3633
Content-Type: application/json

--- request body ---
{"handle":"qa-817f08938e03","password":"****","ttlSeconds":0}

--- response: 422 in 53 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5b32a71-cca0-4455-aee8-d502115c3633
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-c5b32a71-cca0-4455-aee8-d502115c3633","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f9e17fed-73d2-4042-86cc-b30e9d055105

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9e17fed-73d2-4042-86cc-b30e9d055105
Content-Type: application/json

--- request body ---
{"handle":"qa-b36b0076b921","password":"****"}

--- response: 200 in 41 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9e17fed-73d2-4042-86cc-b30e9d055105
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1c168c66-c745-411a-9d43-d631309255cd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f73b8074-d286-45b7-ace0-ca015d8983bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f73b8074-d286-45b7-ace0-ca015d8983bf
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f73b8074-d286-45b7-ace0-ca015d8983bf
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
correlation: qa-172b963c-4f77-4d89-9d84-c787706e198c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-172b963c-4f77-4d89-9d84-c787706e198c
Content-Type: application/json

--- request body ---
{"handle":"qa-b36b0076b921","password":"****"}

--- response: 401 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-172b963c-4f77-4d89-9d84-c787706e198c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-172b963c-4f77-4d89-9d84-c787706e198c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d01406d4-a093-440d-8396-4d906a87055c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01406d4-a093-440d-8396-4d906a87055c
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d01406d4-a093-440d-8396-4d906a87055c
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
correlation: qa-106768be-9cbe-4ec6-8ece-62b53b893d56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-106768be-9cbe-4ec6-8ece-62b53b893d56
Content-Type: application/json

--- request body ---
{"handle":"qa-817f08938e03","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-106768be-9cbe-4ec6-8ece-62b53b893d56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-106768be-9cbe-4ec6-8ece-62b53b893d56"}
```
