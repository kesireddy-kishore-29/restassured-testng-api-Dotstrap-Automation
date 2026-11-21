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
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-94c4f2a3-c2d0-43f9-89f4-1368084b6e36` |
| 2 | `POST /v1/accounts` | 201 | 48 | `qa-910e8e29-291d-4eb3-bc9d-d6034781e71b` |
| 3 | `POST /v1/auth/token` | 200 | 48 | `qa-4b6b2dd7-98f0-46ca-ac8a-c78a1c0f7830` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-63e39af3-6a1c-4a1b-9534-87e4838a3896` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 21 | `qa-cc131ebc-dbec-4037-8b38-5cc112d482bd` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-f54123c9-22ce-44b2-b522-c4798b0aa7f7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-47d504ce-7853-4c3b-aacb-79e2274d7c30` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-cd488bc2-27d6-4fe7-9750-be999f0549eb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-d8231f94-bcd1-4813-9941-fc163ceada85` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-4cc24fe3-84d9-42ac-977d-f68f6ef3ac53` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94c4f2a3-c2d0-43f9-89f4-1368084b6e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94c4f2a3-c2d0-43f9-89f4-1368084b6e36
Content-Type: application/json

--- request body ---
{"handle":"qa-d8832957b557","displayName":"QA d8832957b557","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-94c4f2a3-c2d0-43f9-89f4-1368084b6e36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-d8832957b557
X-Served-Region: eu
Content-Length: 181

{"id":"acc_90d2caa0-2314-4c60-80b3-b38186bd03d2","handle":"qa-d8832957b557","displayName":"QA d8832957b557","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.150574839Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-910e8e29-291d-4eb3-bc9d-d6034781e71b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-910e8e29-291d-4eb3-bc9d-d6034781e71b
Content-Type: application/json

--- request body ---
{"handle":"qa-5e79f8c560ca","displayName":"QA 5e79f8c560ca","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-910e8e29-291d-4eb3-bc9d-d6034781e71b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 8
Location: /v1/accounts/qa-5e79f8c560ca
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56ccf77e-c6c7-4e9c-a283-dab539866530","handle":"qa-5e79f8c560ca","displayName":"QA 5e79f8c560ca","region":"eu","role":"user","createdAt":"2026-11-20T10:10:02.206265686Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4b6b2dd7-98f0-46ca-ac8a-c78a1c0f7830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b6b2dd7-98f0-46ca-ac8a-c78a1c0f7830
Content-Type: application/json

--- request body ---
{"handle":"qa-d8832957b557","password":"****"}

--- response: 200 in 48 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b6b2dd7-98f0-46ca-ac8a-c78a1c0f7830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_90d2caa0-2314-4c60-80b3-b38186bd03d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-63e39af3-6a1c-4a1b-9534-87e4838a3896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63e39af3-6a1c-4a1b-9534-87e4838a3896
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5e79f8c560ca","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-63e39af3-6a1c-4a1b-9534-87e4838a3896
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
Location: /v1/conversations/cnv_cce5a807-0ba4-42b6-aa24-b7dede7b1fcc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cce5a807-0ba4-42b6-aa24-b7dede7b1fcc","subject":"Error contract","status":"open","region":"eu","participants":["qa-d8832957b557","qa-5e79f8c560ca"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:02.357499605Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-d8832957b557
correlation: qa-cc131ebc-dbec-4037-8b38-5cc112d482bd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 061cbf6b-084a-4fb5-919a-5db8545a6975
X-Correlation-Id: qa-cc131ebc-dbec-4037-8b38-5cc112d482bd
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc131ebc-dbec-4037-8b38-5cc112d482bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-d8832957b557","correlationId":"qa-cc131ebc-dbec-4037-8b38-5cc112d482bd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f54123c9-22ce-44b2-b522-c4798b0aa7f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f54123c9-22ce-44b2-b522-c4798b0aa7f7
Content-Type: application/json

--- request body ---
{"handle":"qa-5e79f8c560ca","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f54123c9-22ce-44b2-b522-c4798b0aa7f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56ccf77e-c6c7-4e9c-a283-dab539866530"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-47d504ce-7853-4c3b-aacb-79e2274d7c30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d504ce-7853-4c3b-aacb-79e2274d7c30
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-47d504ce-7853-4c3b-aacb-79e2274d7c30
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
correlation: qa-cd488bc2-27d6-4fe7-9750-be999f0549eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd488bc2-27d6-4fe7-9750-be999f0549eb
Content-Type: application/json

--- request body ---
{"handle":"qa-5e79f8c560ca","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd488bc2-27d6-4fe7-9750-be999f0549eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cd488bc2-27d6-4fe7-9750-be999f0549eb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8231f94-bcd1-4813-9941-fc163ceada85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8231f94-bcd1-4813-9941-fc163ceada85
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8231f94-bcd1-4813-9941-fc163ceada85
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
correlation: qa-4cc24fe3-84d9-42ac-977d-f68f6ef3ac53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cc24fe3-84d9-42ac-977d-f68f6ef3ac53
Content-Type: application/json

--- request body ---
{"handle":"qa-d8832957b557","password":"****"}

--- response: 401 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cc24fe3-84d9-42ac-977d-f68f6ef3ac53
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 428
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4cc24fe3-84d9-42ac-977d-f68f6ef3ac53"}
```
