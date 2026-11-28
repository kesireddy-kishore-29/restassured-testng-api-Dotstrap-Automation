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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-d9aea4e9-9e3b-41a4-a222-16f4a1274825` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-7e920a60-8831-48e8-8a12-73b1d0787387` |
| 3 | `POST /v1/auth/token` | 200 | 12 | `qa-48bf9197-cc14-4918-8639-4c2b0ee77048` |
| 4 | `POST /v1/conversations` | 201 | 78 | `qa-d45b88e5-59f6-4bff-b451-533893525fa5` |
| 5 | `POST /v1/credits/purchases` | 503 | 13 | `qa-61f9e623-84a2-489c-9402-dd830115c182` |
| 6 | `POST /v1/auth/token` | 200 | 27 | `qa-5f5eb6d4-e14c-4df2-b9ca-3d61e4f9a54d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b8f450e7-c586-41e2-ac83-ed73281cb563` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-4a9ba76a-f8b9-4223-a03e-f61f3ce5abdc` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-46a99d91-06c4-4438-9b44-c184a953dcbe` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-376a4494-4200-4498-b6d4-4c5c7ec19571` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d9aea4e9-9e3b-41a4-a222-16f4a1274825

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9aea4e9-9e3b-41a4-a222-16f4a1274825
Content-Type: application/json

--- request body ---
{"handle":"qa-039a182ba98a","displayName":"QA 039a182ba98a","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9aea4e9-9e3b-41a4-a222-16f4a1274825
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-039a182ba98a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_af0154d2-1701-4f99-b2da-766b7d7924c6","handle":"qa-039a182ba98a","displayName":"QA 039a182ba98a","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.873098782Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7e920a60-8831-48e8-8a12-73b1d0787387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e920a60-8831-48e8-8a12-73b1d0787387
Content-Type: application/json

--- request body ---
{"handle":"qa-8ec41db0cd1c","displayName":"QA 8ec41db0cd1c","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e920a60-8831-48e8-8a12-73b1d0787387
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Location: /v1/accounts/qa-8ec41db0cd1c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e37f09bb-0210-4078-ad5b-9953fa506832","handle":"qa-8ec41db0cd1c","displayName":"QA 8ec41db0cd1c","region":"eu","role":"user","createdAt":"2026-11-23T10:54:59.943017287Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-48bf9197-cc14-4918-8639-4c2b0ee77048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48bf9197-cc14-4918-8639-4c2b0ee77048
Content-Type: application/json

--- request body ---
{"handle":"qa-039a182ba98a","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-48bf9197-cc14-4918-8639-4c2b0ee77048
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_af0154d2-1701-4f99-b2da-766b7d7924c6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d45b88e5-59f6-4bff-b451-533893525fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d45b88e5-59f6-4bff-b451-533893525fa5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8ec41db0cd1c","subject":"Error contract","message":"Hi"}

--- response: 201 in 78 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-d45b88e5-59f6-4bff-b451-533893525fa5
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
Location: /v1/conversations/cnv_1320eabe-cb03-4812-9b15-40ca844e05db
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1320eabe-cb03-4812-9b15-40ca844e05db","subject":"Error contract","status":"open","region":"eu","participants":["qa-039a182ba98a","qa-8ec41db0cd1c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:00.042720992Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-61f9e623-84a2-489c-9402-dd830115c182

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 136bdfef-ea3c-4f16-b800-e991dd4d038c
Idempotency-Key: qa-50f816f2162a457c95e0b4d18fc553dc
X-Correlation-Id: qa-61f9e623-84a2-489c-9402-dd830115c182
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f9e623-84a2-489c-9402-dd830115c182
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-61f9e623-84a2-489c-9402-dd830115c182"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5f5eb6d4-e14c-4df2-b9ca-3d61e4f9a54d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f5eb6d4-e14c-4df2-b9ca-3d61e4f9a54d
Content-Type: application/json

--- request body ---
{"handle":"qa-8ec41db0cd1c","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f5eb6d4-e14c-4df2-b9ca-3d61e4f9a54d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e37f09bb-0210-4078-ad5b-9953fa506832"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8f450e7-c586-41e2-ac83-ed73281cb563

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8f450e7-c586-41e2-ac83-ed73281cb563
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8f450e7-c586-41e2-ac83-ed73281cb563
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
correlation: qa-4a9ba76a-f8b9-4223-a03e-f61f3ce5abdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a9ba76a-f8b9-4223-a03e-f61f3ce5abdc
Content-Type: application/json

--- request body ---
{"handle":"qa-8ec41db0cd1c","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a9ba76a-f8b9-4223-a03e-f61f3ce5abdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a9ba76a-f8b9-4223-a03e-f61f3ce5abdc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-46a99d91-06c4-4438-9b44-c184a953dcbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46a99d91-06c4-4438-9b44-c184a953dcbe
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-46a99d91-06c4-4438-9b44-c184a953dcbe
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
correlation: qa-376a4494-4200-4498-b6d4-4c5c7ec19571

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-376a4494-4200-4498-b6d4-4c5c7ec19571
Content-Type: application/json

--- request body ---
{"handle":"qa-039a182ba98a","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-376a4494-4200-4498-b6d4-4c5c7ec19571
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-376a4494-4200-4498-b6d4-4c5c7ec19571"}
```
