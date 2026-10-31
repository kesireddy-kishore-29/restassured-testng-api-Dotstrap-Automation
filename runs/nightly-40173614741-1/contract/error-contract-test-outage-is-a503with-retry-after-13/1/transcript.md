# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-cbc16841-b287-44b7-8106-07bf20e1a4b8` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-3e093f2a-1b3f-4f42-b78a-cf5d26420422` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-ff6646af-cdd1-4a54-a141-d00562874d18` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-94a8d2b0-4830-40f9-a9e9-971415811317` |
| 5 | `GET /v1/credits/balance` | 503 | 42 | `qa-f1e47188-d59f-47b6-87ce-df4d25293d42` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-0fc3d517-25a0-49ec-8ed0-0f9e09879146` |
| 7 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-ec77d401-310c-4dd6-a687-a5a659eba1a2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-ad28f696-5801-4276-b671-2178a64b5786` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-c72d3c23-7e9c-4055-9557-0a832dbf8606` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-2c2443aa-f70f-4e69-a2f6-034a096f5de1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cbc16841-b287-44b7-8106-07bf20e1a4b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbc16841-b287-44b7-8106-07bf20e1a4b8
Content-Type: application/json

--- request body ---
{"handle":"qa-d12323041668","displayName":"QA d12323041668","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbc16841-b287-44b7-8106-07bf20e1a4b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Location: /v1/accounts/qa-d12323041668
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0a9e86b8-a3a2-4793-8a6c-91bbe5d09e06","handle":"qa-d12323041668","displayName":"QA d12323041668","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.664071862Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3e093f2a-1b3f-4f42-b78a-cf5d26420422

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e093f2a-1b3f-4f42-b78a-cf5d26420422
Content-Type: application/json

--- request body ---
{"handle":"qa-5099348f36e6","displayName":"QA 5099348f36e6","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e093f2a-1b3f-4f42-b78a-cf5d26420422
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-5099348f36e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_520a6a6f-f8e8-4acd-9f55-253a16a85cd4","handle":"qa-5099348f36e6","displayName":"QA 5099348f36e6","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.705740501Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ff6646af-cdd1-4a54-a141-d00562874d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6646af-cdd1-4a54-a141-d00562874d18
Content-Type: application/json

--- request body ---
{"handle":"qa-d12323041668","password":"****"}

--- response: 200 in 37 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff6646af-cdd1-4a54-a141-d00562874d18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0a9e86b8-a3a2-4793-8a6c-91bbe5d09e06"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-94a8d2b0-4830-40f9-a9e9-971415811317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94a8d2b0-4830-40f9-a9e9-971415811317
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5099348f36e6","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-94a8d2b0-4830-40f9-a9e9-971415811317
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
Location: /v1/conversations/cnv_62427638-903a-4466-92f2-09386363de8e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_62427638-903a-4466-92f2-09386363de8e","subject":"Error contract","status":"open","region":"eu","participants":["qa-d12323041668","qa-5099348f36e6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.812626067Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-f1e47188-d59f-47b6-87ce-df4d25293d42

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 43e1a10f-ecbf-4fb2-9a71-09a7d68dc995
X-Correlation-Id: qa-f1e47188-d59f-47b6-87ce-df4d25293d42
Content-Type: application/json

--- response: 503 in 42 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f1e47188-d59f-47b6-87ce-df4d25293d42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-f1e47188-d59f-47b6-87ce-df4d25293d42"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0fc3d517-25a0-49ec-8ed0-0f9e09879146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fc3d517-25a0-49ec-8ed0-0f9e09879146
Content-Type: application/json

--- request body ---
{"handle":"qa-5099348f36e6","password":"****"}

--- response: 200 in 41 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fc3d517-25a0-49ec-8ed0-0f9e09879146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_520a6a6f-f8e8-4acd-9f55-253a16a85cd4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ec77d401-310c-4dd6-a687-a5a659eba1a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec77d401-310c-4dd6-a687-a5a659eba1a2
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ec77d401-310c-4dd6-a687-a5a659eba1a2
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
correlation: qa-ad28f696-5801-4276-b671-2178a64b5786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad28f696-5801-4276-b671-2178a64b5786
Content-Type: application/json

--- request body ---
{"handle":"qa-5099348f36e6","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad28f696-5801-4276-b671-2178a64b5786
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad28f696-5801-4276-b671-2178a64b5786"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c72d3c23-7e9c-4055-9557-0a832dbf8606

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c72d3c23-7e9c-4055-9557-0a832dbf8606
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c72d3c23-7e9c-4055-9557-0a832dbf8606
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
correlation: qa-2c2443aa-f70f-4e69-a2f6-034a096f5de1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c2443aa-f70f-4e69-a2f6-034a096f5de1
Content-Type: application/json

--- request body ---
{"handle":"qa-d12323041668","password":"****"}

--- response: 401 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c2443aa-f70f-4e69-a2f6-034a096f5de1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c2443aa-f70f-4e69-a2f6-034a096f5de1"}
```
