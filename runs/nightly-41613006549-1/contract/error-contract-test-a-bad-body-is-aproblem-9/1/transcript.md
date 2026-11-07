# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[9]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-466c066f-055d-437c-a97d-ef2194fa1788` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-9945728e-742f-4a80-afe5-a7b4f903fb8d` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-2ab35f63-575b-4b4d-983a-dfb9400b693f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-811d1c08-d2d1-4bd2-9980-5e0f7dc8efed` |
| 5 | `POST /v1/conversations` | 400 | 8 | `qa-5742fe37-ec54-4c91-b649-627ed3a67cc4` |
| 6 | `POST /v1/auth/token` | 200 | 44 | `qa-76417ef7-575f-4b0f-bcac-c9aedb7d2518` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-4b8f0885-d3be-42bb-ac20-2686460cb127` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-ee7e19a0-3e7d-4244-b4ba-69ed4d5c0252` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-6823a182-bfcc-432a-8a19-c3dd81b00888` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-27815927-6b65-4a50-8b4b-725d179d7b6a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-466c066f-055d-437c-a97d-ef2194fa1788

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-466c066f-055d-437c-a97d-ef2194fa1788
Content-Type: application/json

--- request body ---
{"handle":"qa-4377146317b0","displayName":"QA 4377146317b0","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-466c066f-055d-437c-a97d-ef2194fa1788
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 9
Location: /v1/accounts/qa-4377146317b0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_321d1f22-2fe9-4901-bfbf-d9c925861ea0","handle":"qa-4377146317b0","displayName":"QA 4377146317b0","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.725940382Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9945728e-742f-4a80-afe5-a7b4f903fb8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9945728e-742f-4a80-afe5-a7b4f903fb8d
Content-Type: application/json

--- request body ---
{"handle":"qa-93914c215328","displayName":"QA 93914c215328","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-9945728e-742f-4a80-afe5-a7b4f903fb8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 9
Location: /v1/accounts/qa-93914c215328
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ebfcf1f6-a7a6-472d-be04-988d94f5e279","handle":"qa-93914c215328","displayName":"QA 93914c215328","region":"eu","role":"user","createdAt":"2026-11-03T09:41:32.750303529Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2ab35f63-575b-4b4d-983a-dfb9400b693f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ab35f63-575b-4b4d-983a-dfb9400b693f
Content-Type: application/json

--- request body ---
{"handle":"qa-4377146317b0","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ab35f63-575b-4b4d-983a-dfb9400b693f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_321d1f22-2fe9-4901-bfbf-d9c925861ea0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-811d1c08-d2d1-4bd2-9980-5e0f7dc8efed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811d1c08-d2d1-4bd2-9980-5e0f7dc8efed
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-93914c215328","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-811d1c08-d2d1-4bd2-9980-5e0f7dc8efed
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
Location: /v1/conversations/cnv_0cf8ea32-815c-4f60-9381-96e5b3bd40a5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0cf8ea32-815c-4f60-9381-96e5b3bd40a5","subject":"Error contract","status":"open","region":"eu","participants":["qa-4377146317b0","qa-93914c215328"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:32.815583087Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5742fe37-ec54-4c91-b649-627ed3a67cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5742fe37-ec54-4c91-b649-627ed3a67cc4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5742fe37-ec54-4c91-b649-627ed3a67cc4
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
Content-Length: 258

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations","correlationId":"qa-5742fe37-ec54-4c91-b649-627ed3a67cc4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-76417ef7-575f-4b0f-bcac-c9aedb7d2518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76417ef7-575f-4b0f-bcac-c9aedb7d2518
Content-Type: application/json

--- request body ---
{"handle":"qa-93914c215328","password":"****"}

--- response: 200 in 44 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-76417ef7-575f-4b0f-bcac-c9aedb7d2518
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 408
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebfcf1f6-a7a6-472d-be04-988d94f5e279"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b8f0885-d3be-42bb-ac20-2686460cb127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b8f0885-d3be-42bb-ac20-2686460cb127
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b8f0885-d3be-42bb-ac20-2686460cb127
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
correlation: qa-ee7e19a0-3e7d-4244-b4ba-69ed4d5c0252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee7e19a0-3e7d-4244-b4ba-69ed4d5c0252
Content-Type: application/json

--- request body ---
{"handle":"qa-93914c215328","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee7e19a0-3e7d-4244-b4ba-69ed4d5c0252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee7e19a0-3e7d-4244-b4ba-69ed4d5c0252"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6823a182-bfcc-432a-8a19-c3dd81b00888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6823a182-bfcc-432a-8a19-c3dd81b00888
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6823a182-bfcc-432a-8a19-c3dd81b00888
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
correlation: qa-27815927-6b65-4a50-8b4b-725d179d7b6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27815927-6b65-4a50-8b4b-725d179d7b6a
Content-Type: application/json

--- request body ---
{"handle":"qa-4377146317b0","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27815927-6b65-4a50-8b4b-725d179d7b6a
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27815927-6b65-4a50-8b4b-725d179d7b6a"}
```
