# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-22580061-1b25-4bdb-9104-d855700cafe5` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-706aee96-11c4-4702-8719-3d6567690419` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-ef93f09f-c6ce-4f9c-92f1-e97405379f87` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-bb010e21-731e-4097-aad0-aa38073e779a` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 8 | `qa-83cde958-9070-4a3e-a58f-e279e3bdc6f0` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-92ecc899-57ce-43c7-a111-4099940d2bf5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-774da3a0-a2f0-454e-b3fa-07d9b0331db3` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-664c8854-9510-488a-9453-a75f9713bc53` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-2db5dc2a-6477-43d1-8764-950d153604e0` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-9c5716ad-9a79-4b0a-911e-0ea479df6d4c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-22580061-1b25-4bdb-9104-d855700cafe5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22580061-1b25-4bdb-9104-d855700cafe5
Content-Type: application/json

--- request body ---
{"handle":"qa-e4a40a2bccd5","displayName":"QA e4a40a2bccd5","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-22580061-1b25-4bdb-9104-d855700cafe5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 413
RateLimit-Reset: 8
Location: /v1/accounts/qa-e4a40a2bccd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3541941-ca99-47e0-8f7a-db79b6e67e75","handle":"qa-e4a40a2bccd5","displayName":"QA e4a40a2bccd5","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.654532950Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-706aee96-11c4-4702-8719-3d6567690419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-706aee96-11c4-4702-8719-3d6567690419
Content-Type: application/json

--- request body ---
{"handle":"qa-a245b1ab5ecc","displayName":"QA a245b1ab5ecc","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-706aee96-11c4-4702-8719-3d6567690419
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-a245b1ab5ecc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9253fa0-f710-4c18-97ef-cb67600fc9af","handle":"qa-a245b1ab5ecc","displayName":"QA a245b1ab5ecc","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.702900703Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ef93f09f-c6ce-4f9c-92f1-e97405379f87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef93f09f-c6ce-4f9c-92f1-e97405379f87
Content-Type: application/json

--- request body ---
{"handle":"qa-e4a40a2bccd5","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef93f09f-c6ce-4f9c-92f1-e97405379f87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3541941-ca99-47e0-8f7a-db79b6e67e75"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb010e21-731e-4097-aad0-aa38073e779a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb010e21-731e-4097-aad0-aa38073e779a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a245b1ab5ecc","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb010e21-731e-4097-aad0-aa38073e779a
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
Location: /v1/conversations/cnv_f97ba64e-b812-4ee2-92dd-bca8686cc801
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f97ba64e-b812-4ee2-92dd-bca8686cc801","subject":"Error contract","status":"open","region":"eu","participants":["qa-e4a40a2bccd5","qa-a245b1ab5ecc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.762473494Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_f97ba64e-b812-4ee2-92dd-bca8686cc801/messages
correlation: qa-83cde958-9070-4a3e-a58f-e279e3bdc6f0

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9e121312-2767-4db8-a204-729d17de296d
X-Correlation-Id: qa-83cde958-9070-4a3e-a58f-e279e3bdc6f0
Content-Type: application/json

--- response: 503 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83cde958-9070-4a3e-a58f-e279e3bdc6f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_f97ba64e-b812-4ee2-92dd-bca8686cc801/messages","correlationId":"qa-83cde958-9070-4a3e-a58f-e279e3bdc6f0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-92ecc899-57ce-43c7-a111-4099940d2bf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92ecc899-57ce-43c7-a111-4099940d2bf5
Content-Type: application/json

--- request body ---
{"handle":"qa-a245b1ab5ecc","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-92ecc899-57ce-43c7-a111-4099940d2bf5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9253fa0-f710-4c18-97ef-cb67600fc9af"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-774da3a0-a2f0-454e-b3fa-07d9b0331db3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-774da3a0-a2f0-454e-b3fa-07d9b0331db3
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-774da3a0-a2f0-454e-b3fa-07d9b0331db3
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
correlation: qa-664c8854-9510-488a-9453-a75f9713bc53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-664c8854-9510-488a-9453-a75f9713bc53
Content-Type: application/json

--- request body ---
{"handle":"qa-a245b1ab5ecc","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-664c8854-9510-488a-9453-a75f9713bc53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-664c8854-9510-488a-9453-a75f9713bc53"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2db5dc2a-6477-43d1-8764-950d153604e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2db5dc2a-6477-43d1-8764-950d153604e0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2db5dc2a-6477-43d1-8764-950d153604e0
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
correlation: qa-9c5716ad-9a79-4b0a-911e-0ea479df6d4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c5716ad-9a79-4b0a-911e-0ea479df6d4c
Content-Type: application/json

--- request body ---
{"handle":"qa-e4a40a2bccd5","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c5716ad-9a79-4b0a-911e-0ea479df6d4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 371
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c5716ad-9a79-4b0a-911e-0ea479df6d4c"}
```
