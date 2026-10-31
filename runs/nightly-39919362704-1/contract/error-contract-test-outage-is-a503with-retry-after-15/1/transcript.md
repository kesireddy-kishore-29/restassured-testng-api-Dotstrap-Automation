# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-cf7a6b10-fcab-497d-a6d4-270f0bd335e8` |
| 2 | `POST /v1/accounts` | 201 | 47 | `qa-8db17d7b-3b3e-4630-9c73-14cbb523a387` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-21510639-a6af-4b84-94d1-7ea08b9a1fc1` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-eb69a6a2-dbed-4943-a5df-1af721c8be3f` |
| 5 | `POST /v1/credits/purchases` | 503 | 21 | `qa-46f82f2a-79d1-4c71-9fc3-ad91c0fbb5c7` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-0f2bc5e9-7753-4ba9-a361-2baa37ae6766` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4f4688f7-bac2-46cd-b723-c09c5b9ceec3` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-411fb77b-18b9-4b56-b4e9-7b3208174d48` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-fc640149-2dd4-45f7-b5a9-f0bfb510a201` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-64f8f3b2-d06b-4c91-82b9-98f908e170ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cf7a6b10-fcab-497d-a6d4-270f0bd335e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf7a6b10-fcab-497d-a6d4-270f0bd335e8
Content-Type: application/json

--- request body ---
{"handle":"qa-ed28bf0e0e11","displayName":"QA ed28bf0e0e11","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf7a6b10-fcab-497d-a6d4-270f0bd335e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-ed28bf0e0e11
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1d6a142-968a-4d71-9b9d-39d77b634aa6","handle":"qa-ed28bf0e0e11","displayName":"QA ed28bf0e0e11","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.750526717Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8db17d7b-3b3e-4630-9c73-14cbb523a387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8db17d7b-3b3e-4630-9c73-14cbb523a387
Content-Type: application/json

--- request body ---
{"handle":"qa-455493f83c65","displayName":"QA 455493f83c65","password":"****","region":"eu"}

--- response: 201 in 47 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8db17d7b-3b3e-4630-9c73-14cbb523a387
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-455493f83c65
X-Served-Region: eu
Content-Length: 181

{"id":"acc_917077a2-de36-4b6d-b29b-74358dd820de","handle":"qa-455493f83c65","displayName":"QA 455493f83c65","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.820186588Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-21510639-a6af-4b84-94d1-7ea08b9a1fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21510639-a6af-4b84-94d1-7ea08b9a1fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-ed28bf0e0e11","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-21510639-a6af-4b84-94d1-7ea08b9a1fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1d6a142-968a-4d71-9b9d-39d77b634aa6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eb69a6a2-dbed-4943-a5df-1af721c8be3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb69a6a2-dbed-4943-a5df-1af721c8be3f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-455493f83c65","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb69a6a2-dbed-4943-a5df-1af721c8be3f
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
Location: /v1/conversations/cnv_d62a55b7-c5d2-49bb-b6b9-c757a21e6a27
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d62a55b7-c5d2-49bb-b6b9-c757a21e6a27","subject":"Error contract","status":"open","region":"eu","participants":["qa-ed28bf0e0e11","qa-455493f83c65"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.916349513Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-46f82f2a-79d1-4c71-9fc3-ad91c0fbb5c7

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 010fd23c-8fbe-421a-b42e-3d4c345d9bc3
Idempotency-Key: qa-c9f865abc40944a9b5587396ee285c9a
X-Correlation-Id: qa-46f82f2a-79d1-4c71-9fc3-ad91c0fbb5c7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46f82f2a-79d1-4c71-9fc3-ad91c0fbb5c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-46f82f2a-79d1-4c71-9fc3-ad91c0fbb5c7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f2bc5e9-7753-4ba9-a361-2baa37ae6766

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f2bc5e9-7753-4ba9-a361-2baa37ae6766
Content-Type: application/json

--- request body ---
{"handle":"qa-455493f83c65","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f2bc5e9-7753-4ba9-a361-2baa37ae6766
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_917077a2-de36-4b6d-b29b-74358dd820de"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4f4688f7-bac2-46cd-b723-c09c5b9ceec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f4688f7-bac2-46cd-b723-c09c5b9ceec3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4f4688f7-bac2-46cd-b723-c09c5b9ceec3
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
correlation: qa-411fb77b-18b9-4b56-b4e9-7b3208174d48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-411fb77b-18b9-4b56-b4e9-7b3208174d48
Content-Type: application/json

--- request body ---
{"handle":"qa-455493f83c65","password":"****"}

--- response: 401 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-411fb77b-18b9-4b56-b4e9-7b3208174d48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-411fb77b-18b9-4b56-b4e9-7b3208174d48"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc640149-2dd4-45f7-b5a9-f0bfb510a201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc640149-2dd4-45f7-b5a9-f0bfb510a201
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc640149-2dd4-45f7-b5a9-f0bfb510a201
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
correlation: qa-64f8f3b2-d06b-4c91-82b9-98f908e170ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64f8f3b2-d06b-4c91-82b9-98f908e170ea
Content-Type: application/json

--- request body ---
{"handle":"qa-ed28bf0e0e11","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64f8f3b2-d06b-4c91-82b9-98f908e170ea
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-64f8f3b2-d06b-4c91-82b9-98f908e170ea"}
```
