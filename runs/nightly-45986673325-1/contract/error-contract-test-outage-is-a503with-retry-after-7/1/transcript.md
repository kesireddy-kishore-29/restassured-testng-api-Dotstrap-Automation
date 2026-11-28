# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-41eb696e-0371-4a0d-8228-acc94f5452a4` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-f7500698-5507-43ab-95e6-de9665778780` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-dfeec01a-069c-443c-83b6-4c3a2b72eec0` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-e260b78f-50c3-4d15-b416-c230b2686901` |
| 5 | `GET /v1/conversations` | 503 | 52 | `qa-af9a35d7-9fcc-4ac8-93fd-58a4d80172d3` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-b57efc09-b536-43b2-96da-7e83a1c7feba` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-fb93ee25-ab13-440a-a1c9-7c4ccb60dac5` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-4318bee0-9131-4ef8-8556-1cbf605e6b6c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-b7f948a5-fd63-44f4-a970-797cfc19420b` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-51e6d6d6-86f9-4cba-a9b2-dbbe095b0c7b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41eb696e-0371-4a0d-8228-acc94f5452a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41eb696e-0371-4a0d-8228-acc94f5452a4
Content-Type: application/json

--- request body ---
{"handle":"qa-e97107386665","displayName":"QA e97107386665","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-41eb696e-0371-4a0d-8228-acc94f5452a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-e97107386665
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d8573efc-ff34-4f52-a45e-456899be44c0","handle":"qa-e97107386665","displayName":"QA e97107386665","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.718419886Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f7500698-5507-43ab-95e6-de9665778780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7500698-5507-43ab-95e6-de9665778780
Content-Type: application/json

--- request body ---
{"handle":"qa-5e75f5bab74d","displayName":"QA 5e75f5bab74d","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7500698-5507-43ab-95e6-de9665778780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Location: /v1/accounts/qa-5e75f5bab74d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_11c12e10-a122-4798-975f-2fe01a69a215","handle":"qa-5e75f5bab74d","displayName":"QA 5e75f5bab74d","region":"eu","role":"user","createdAt":"2026-11-27T10:59:58.771827190Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dfeec01a-069c-443c-83b6-4c3a2b72eec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfeec01a-069c-443c-83b6-4c3a2b72eec0
Content-Type: application/json

--- request body ---
{"handle":"qa-e97107386665","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfeec01a-069c-443c-83b6-4c3a2b72eec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 450
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d8573efc-ff34-4f52-a45e-456899be44c0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e260b78f-50c3-4d15-b416-c230b2686901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e260b78f-50c3-4d15-b416-c230b2686901
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5e75f5bab74d","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e260b78f-50c3-4d15-b416-c230b2686901
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
Location: /v1/conversations/cnv_bfd82d84-64f4-47df-b2c4-f0f59df18a59
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bfd82d84-64f4-47df-b2c4-f0f59df18a59","subject":"Error contract","status":"open","region":"eu","participants":["qa-e97107386665","qa-5e75f5bab74d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:58.881108160Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-af9a35d7-9fcc-4ac8-93fd-58a4d80172d3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: d672412f-c8c1-45d5-8164-63e5946a5244
X-Correlation-Id: qa-af9a35d7-9fcc-4ac8-93fd-58a4d80172d3
Content-Type: application/json

--- response: 503 in 52 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af9a35d7-9fcc-4ac8-93fd-58a4d80172d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-af9a35d7-9fcc-4ac8-93fd-58a4d80172d3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b57efc09-b536-43b2-96da-7e83a1c7feba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b57efc09-b536-43b2-96da-7e83a1c7feba
Content-Type: application/json

--- request body ---
{"handle":"qa-5e75f5bab74d","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b57efc09-b536-43b2-96da-7e83a1c7feba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_11c12e10-a122-4798-975f-2fe01a69a215"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fb93ee25-ab13-440a-a1c9-7c4ccb60dac5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb93ee25-ab13-440a-a1c9-7c4ccb60dac5
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fb93ee25-ab13-440a-a1c9-7c4ccb60dac5
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
correlation: qa-4318bee0-9131-4ef8-8556-1cbf605e6b6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4318bee0-9131-4ef8-8556-1cbf605e6b6c
Content-Type: application/json

--- request body ---
{"handle":"qa-5e75f5bab74d","password":"****"}

--- response: 401 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4318bee0-9131-4ef8-8556-1cbf605e6b6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4318bee0-9131-4ef8-8556-1cbf605e6b6c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b7f948a5-fd63-44f4-a970-797cfc19420b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7f948a5-fd63-44f4-a970-797cfc19420b
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b7f948a5-fd63-44f4-a970-797cfc19420b
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
correlation: qa-51e6d6d6-86f9-4cba-a9b2-dbbe095b0c7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e6d6d6-86f9-4cba-a9b2-dbbe095b0c7b
Content-Type: application/json

--- request body ---
{"handle":"qa-e97107386665","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51e6d6d6-86f9-4cba-a9b2-dbbe095b0c7b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-51e6d6d6-86f9-4cba-a9b2-dbbe095b0c7b"}
```
