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
| 1 | `POST /v1/accounts` | 201 | 507 | `qa-6b053f97-aae1-4f98-9d8f-d29896f54217` |
| 2 | `POST /v1/accounts` | 201 | 89 | `qa-5d5ec26f-c78e-4c66-a477-90c9b67a0ada` |
| 3 | `POST /v1/auth/token` | 200 | 88 | `qa-cf7444d5-d9c3-4a03-a1f7-e2394a3c9335` |
| 4 | `POST /v1/conversations` | 201 | 88 | `qa-83d52a16-42e1-400d-8c5b-34b46ad5346b` |
| 5 | `POST /v1/auth/token` | 400 | 41 | `qa-e3feac69-b211-42b8-9f05-991a99230c6a` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-5ad5f4dd-650c-46b1-9274-dcd09d542a43` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-e245d0da-959a-4fab-b9bd-6e29040d85e2` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-fabd0586-f93b-4f9d-b1e6-05be22e27507` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-0198922e-42d1-4ce6-92fa-fea32bca20f0` |
| 10 | `POST /v1/auth/token` | 401 | 55 | `qa-0a50714f-48c9-4a29-acab-25b23989c6ba` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b053f97-aae1-4f98-9d8f-d29896f54217

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b053f97-aae1-4f98-9d8f-d29896f54217
Content-Type: application/json

--- request body ---
{"handle":"qa-93938e3a3573","displayName":"QA 93938e3a3573","password":"****","region":"eu"}

--- response: 201 in 507 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b053f97-aae1-4f98-9d8f-d29896f54217
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-93938e3a3573
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cf2da8d9-1570-4e5a-bda3-00fb9289377d","handle":"qa-93938e3a3573","displayName":"QA 93938e3a3573","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.636390444Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5d5ec26f-c78e-4c66-a477-90c9b67a0ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d5ec26f-c78e-4c66-a477-90c9b67a0ada
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cf64c1f0bf","displayName":"QA f4cf64c1f0bf","password":"****","region":"eu"}

--- response: 201 in 89 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d5ec26f-c78e-4c66-a477-90c9b67a0ada
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Location: /v1/accounts/qa-f4cf64c1f0bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_45683557-ed43-4df5-9974-7b977b866135","handle":"qa-f4cf64c1f0bf","displayName":"QA f4cf64c1f0bf","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.143367438Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cf7444d5-d9c3-4a03-a1f7-e2394a3c9335

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7444d5-d9c3-4a03-a1f7-e2394a3c9335
Content-Type: application/json

--- request body ---
{"handle":"qa-93938e3a3573","password":"****"}

--- response: 200 in 88 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf7444d5-d9c3-4a03-a1f7-e2394a3c9335
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cf2da8d9-1570-4e5a-bda3-00fb9289377d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-83d52a16-42e1-400d-8c5b-34b46ad5346b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83d52a16-42e1-400d-8c5b-34b46ad5346b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f4cf64c1f0bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 88 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-83d52a16-42e1-400d-8c5b-34b46ad5346b
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
Location: /v1/conversations/cnv_ea524485-c21c-48e6-a636-b5ca103bc65d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ea524485-c21c-48e6-a636-b5ca103bc65d","subject":"Error contract","status":"open","region":"eu","participants":["qa-93938e3a3573","qa-f4cf64c1f0bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.467680345Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e3feac69-b211-42b8-9f05-991a99230c6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3feac69-b211-42b8-9f05-991a99230c6a
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 41 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3feac69-b211-42b8-9f05-991a99230c6a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 549
RateLimit-Reset: 9
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-e3feac69-b211-42b8-9f05-991a99230c6a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5ad5f4dd-650c-46b1-9274-dcd09d542a43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ad5f4dd-650c-46b1-9274-dcd09d542a43
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cf64c1f0bf","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ad5f4dd-650c-46b1-9274-dcd09d542a43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_45683557-ed43-4df5-9974-7b977b866135"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e245d0da-959a-4fab-b9bd-6e29040d85e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e245d0da-959a-4fab-b9bd-6e29040d85e2
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e245d0da-959a-4fab-b9bd-6e29040d85e2
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
correlation: qa-fabd0586-f93b-4f9d-b1e6-05be22e27507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fabd0586-f93b-4f9d-b1e6-05be22e27507
Content-Type: application/json

--- request body ---
{"handle":"qa-f4cf64c1f0bf","password":"****"}

--- response: 401 in 28 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fabd0586-f93b-4f9d-b1e6-05be22e27507
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fabd0586-f93b-4f9d-b1e6-05be22e27507"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0198922e-42d1-4ce6-92fa-fea32bca20f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0198922e-42d1-4ce6-92fa-fea32bca20f0
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0198922e-42d1-4ce6-92fa-fea32bca20f0
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
correlation: qa-0a50714f-48c9-4a29-acab-25b23989c6ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a50714f-48c9-4a29-acab-25b23989c6ba
Content-Type: application/json

--- request body ---
{"handle":"qa-93938e3a3573","password":"****"}

--- response: 401 in 55 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a50714f-48c9-4a29-acab-25b23989c6ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0a50714f-48c9-4a29-acab-25b23989c6ba"}
```
