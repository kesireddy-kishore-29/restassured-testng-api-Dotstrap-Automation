# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-6a5d5fef-7b0a-49bf-a460-ff9878f76474` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-15d26bc1-131a-484b-92f2-516a8e525a5f` |
| 3 | `POST /v1/auth/token` | 200 | 54 | `qa-e25c2a6d-7d59-439e-ad24-4707bd8bf9e2` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-ebe5e7d6-d669-4140-b650-08fc4347bfae` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 24 | `qa-5ce3e27f-b6b6-4a53-b037-85794e508b14` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-097b4808-fd26-47fc-9959-e50d73f4c6bb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-5e062390-7cab-47af-993f-d88f59078259` |
| 8 | `POST /v1/auth/token` | 401 | 3 | `qa-411ffb6e-b6f3-497f-86dd-4c7a43cd1410` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e315961d-9641-4f44-b737-e6b61124b140` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-cbdab749-e038-4d10-8b85-3ad5dbf1154a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6a5d5fef-7b0a-49bf-a460-ff9878f76474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a5d5fef-7b0a-49bf-a460-ff9878f76474
Content-Type: application/json

--- request body ---
{"handle":"qa-87b4528aa66d","displayName":"QA 87b4528aa66d","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a5d5fef-7b0a-49bf-a460-ff9878f76474
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-87b4528aa66d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d1be1a5-9742-4f6f-9e5f-b5d3e22d5876","handle":"qa-87b4528aa66d","displayName":"QA 87b4528aa66d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.673507526Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-15d26bc1-131a-484b-92f2-516a8e525a5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15d26bc1-131a-484b-92f2-516a8e525a5f
Content-Type: application/json

--- request body ---
{"handle":"qa-0c85d31e9a17","displayName":"QA 0c85d31e9a17","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-15d26bc1-131a-484b-92f2-516a8e525a5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-0c85d31e9a17
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4d9a9f74-74bf-4a22-b346-157b9b082102","handle":"qa-0c85d31e9a17","displayName":"QA 0c85d31e9a17","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.716464510Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e25c2a6d-7d59-439e-ad24-4707bd8bf9e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e25c2a6d-7d59-439e-ad24-4707bd8bf9e2
Content-Type: application/json

--- request body ---
{"handle":"qa-87b4528aa66d","password":"****"}

--- response: 200 in 54 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-e25c2a6d-7d59-439e-ad24-4707bd8bf9e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d1be1a5-9742-4f6f-9e5f-b5d3e22d5876"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ebe5e7d6-d669-4140-b650-08fc4347bfae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebe5e7d6-d669-4140-b650-08fc4347bfae
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0c85d31e9a17","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebe5e7d6-d669-4140-b650-08fc4347bfae
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
Location: /v1/conversations/cnv_998fc9d0-0d90-40f9-802b-5f8876c4bba6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_998fc9d0-0d90-40f9-802b-5f8876c4bba6","subject":"Error contract","status":"open","region":"eu","participants":["qa-87b4528aa66d","qa-0c85d31e9a17"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.822521885Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-87b4528aa66d
correlation: qa-5ce3e27f-b6b6-4a53-b037-85794e508b14

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c79dc9f1-f4fd-478f-a7f5-f57a0f583be4
X-Correlation-Id: qa-5ce3e27f-b6b6-4a53-b037-85794e508b14
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5ce3e27f-b6b6-4a53-b037-85794e508b14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-87b4528aa66d","correlationId":"qa-5ce3e27f-b6b6-4a53-b037-85794e508b14"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-097b4808-fd26-47fc-9959-e50d73f4c6bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-097b4808-fd26-47fc-9959-e50d73f4c6bb
Content-Type: application/json

--- request body ---
{"handle":"qa-0c85d31e9a17","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-097b4808-fd26-47fc-9959-e50d73f4c6bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4d9a9f74-74bf-4a22-b346-157b9b082102"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e062390-7cab-47af-993f-d88f59078259

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e062390-7cab-47af-993f-d88f59078259
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e062390-7cab-47af-993f-d88f59078259
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
correlation: qa-411ffb6e-b6f3-497f-86dd-4c7a43cd1410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411ffb6e-b6f3-497f-86dd-4c7a43cd1410
Content-Type: application/json

--- request body ---
{"handle":"qa-0c85d31e9a17","password":"****"}

--- response: 401 in 3 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-411ffb6e-b6f3-497f-86dd-4c7a43cd1410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-411ffb6e-b6f3-497f-86dd-4c7a43cd1410"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e315961d-9641-4f44-b737-e6b61124b140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e315961d-9641-4f44-b737-e6b61124b140
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e315961d-9641-4f44-b737-e6b61124b140
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
correlation: qa-cbdab749-e038-4d10-8b85-3ad5dbf1154a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbdab749-e038-4d10-8b85-3ad5dbf1154a
Content-Type: application/json

--- request body ---
{"handle":"qa-87b4528aa66d","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbdab749-e038-4d10-8b85-3ad5dbf1154a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 426
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbdab749-e038-4d10-8b85-3ad5dbf1154a"}
```
