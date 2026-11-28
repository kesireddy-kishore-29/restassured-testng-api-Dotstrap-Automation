# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-0bfae18c-3b8f-4af8-86f2-08775b9c9d05` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-0e628986-5066-4d78-bb97-cd23395393b6` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-be33ee35-d27f-401a-a3a5-faa09557c5a4` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-b55df0b9-cf39-4b4f-ba15-350d0a7b6f26` |
| 5 | `POST /v1/credits/purchases` | 422 | 8 | `qa-623f7e62-e309-4dbd-8449-98658ea2781e` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-1e316c0a-00d9-49d8-b074-73235f9b72c5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-8b8d3ec0-bbd8-4a89-8737-615a17a1b1bd` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-5ee84b49-d6cb-4b8a-b206-4124789d6e5d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-e7571a66-486d-456c-8941-099a0c63c5c2` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-68b43c45-b6d0-4d03-a475-4f2291904017` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0bfae18c-3b8f-4af8-86f2-08775b9c9d05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bfae18c-3b8f-4af8-86f2-08775b9c9d05
Content-Type: application/json

--- request body ---
{"handle":"qa-92403edae43f","displayName":"QA 92403edae43f","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-0bfae18c-3b8f-4af8-86f2-08775b9c9d05
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-92403edae43f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_347e4323-5a95-4eda-a7b8-9c813b0bbc00","handle":"qa-92403edae43f","displayName":"QA 92403edae43f","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.000267223Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0e628986-5066-4d78-bb97-cd23395393b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e628986-5066-4d78-bb97-cd23395393b6
Content-Type: application/json

--- request body ---
{"handle":"qa-ca489355a2c3","displayName":"QA ca489355a2c3","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e628986-5066-4d78-bb97-cd23395393b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 6
Location: /v1/accounts/qa-ca489355a2c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abde1d70-79cd-46d3-bd87-257cdf8ec21b","handle":"qa-ca489355a2c3","displayName":"QA ca489355a2c3","region":"eu","role":"user","createdAt":"2026-11-26T11:02:47.031757694Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-be33ee35-d27f-401a-a3a5-faa09557c5a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be33ee35-d27f-401a-a3a5-faa09557c5a4
Content-Type: application/json

--- request body ---
{"handle":"qa-92403edae43f","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-be33ee35-d27f-401a-a3a5-faa09557c5a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_347e4323-5a95-4eda-a7b8-9c813b0bbc00"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b55df0b9-cf39-4b4f-ba15-350d0a7b6f26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b55df0b9-cf39-4b4f-ba15-350d0a7b6f26
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ca489355a2c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-b55df0b9-cf39-4b4f-ba15-350d0a7b6f26
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
Location: /v1/conversations/cnv_e18ca1f1-1888-4dce-b154-7baf062015d8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e18ca1f1-1888-4dce-b154-7baf062015d8","subject":"Error contract","status":"open","region":"eu","participants":["qa-92403edae43f","qa-ca489355a2c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:47.088793603Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-623f7e62-e309-4dbd-8449-98658ea2781e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-43a76d76650c4b84bd26643819bfb0cf
X-Correlation-Id: qa-623f7e62-e309-4dbd-8449-98658ea2781e
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-623f7e62-e309-4dbd-8449-98658ea2781e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-623f7e62-e309-4dbd-8449-98658ea2781e","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1e316c0a-00d9-49d8-b074-73235f9b72c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e316c0a-00d9-49d8-b074-73235f9b72c5
Content-Type: application/json

--- request body ---
{"handle":"qa-ca489355a2c3","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e316c0a-00d9-49d8-b074-73235f9b72c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abde1d70-79cd-46d3-bd87-257cdf8ec21b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b8d3ec0-bbd8-4a89-8737-615a17a1b1bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b8d3ec0-bbd8-4a89-8737-615a17a1b1bd
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b8d3ec0-bbd8-4a89-8737-615a17a1b1bd
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
correlation: qa-5ee84b49-d6cb-4b8a-b206-4124789d6e5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ee84b49-d6cb-4b8a-b206-4124789d6e5d
Content-Type: application/json

--- request body ---
{"handle":"qa-ca489355a2c3","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ee84b49-d6cb-4b8a-b206-4124789d6e5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5ee84b49-d6cb-4b8a-b206-4124789d6e5d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7571a66-486d-456c-8941-099a0c63c5c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7571a66-486d-456c-8941-099a0c63c5c2
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7571a66-486d-456c-8941-099a0c63c5c2
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
correlation: qa-68b43c45-b6d0-4d03-a475-4f2291904017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68b43c45-b6d0-4d03-a475-4f2291904017
Content-Type: application/json

--- request body ---
{"handle":"qa-92403edae43f","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68b43c45-b6d0-4d03-a475-4f2291904017
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68b43c45-b6d0-4d03-a475-4f2291904017"}
```
