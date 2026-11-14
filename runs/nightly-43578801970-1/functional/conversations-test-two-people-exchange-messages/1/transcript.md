# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 394 | `qa-074f4b9c-f972-48c0-881a-674227f8762d` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-47661501-3836-4d2f-ad6d-5989c5267adc` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-30d89d68-9be6-4663-9940-37056da63390` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-a725a2f2-21fd-4ef9-a2b1-eed376ccbf62` |
| 5 | `POST /v1/auth/token` | 200 | 23 | `qa-5a4819c1-4834-4dea-989e-920e17931b48` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-1be231f3-596b-4cc2-829b-fe1408ab72d8` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 24 | `qa-c74c0bf2-281b-41e1-9633-8f32a8fa191c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-29fe0ca7-29d9-4851-b9bc-b7c52426491c` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-03e6cf0e-0f55-4536-b053-f952ec3f3a88` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-09c88a41-4d08-409b-99d7-8514e5d50a33` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-4073ba27-2812-4c01-87da-14835583f7fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-074f4b9c-f972-48c0-881a-674227f8762d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-074f4b9c-f972-48c0-881a-674227f8762d
Content-Type: application/json

--- request body ---
{"handle":"qa-68fcaeede7b6","displayName":"QA 68fcaeede7b6","password":"****","region":"eu"}

--- response: 201 in 394 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-074f4b9c-f972-48c0-881a-674227f8762d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-68fcaeede7b6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b14f3153-bcb5-44bc-8f60-9eea3b533097","handle":"qa-68fcaeede7b6","displayName":"QA 68fcaeede7b6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.470480621Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-47661501-3836-4d2f-ad6d-5989c5267adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47661501-3836-4d2f-ad6d-5989c5267adc
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6c43660173","displayName":"QA 6e6c43660173","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-47661501-3836-4d2f-ad6d-5989c5267adc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-6e6c43660173
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cac8b7b7-9691-408f-bf56-e6a46099f338","handle":"qa-6e6c43660173","displayName":"QA 6e6c43660173","region":"eu","role":"user","createdAt":"2026-11-14T09:05:22.746689532Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-30d89d68-9be6-4663-9940-37056da63390

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d89d68-9be6-4663-9940-37056da63390
Content-Type: application/json

--- request body ---
{"handle":"qa-68fcaeede7b6","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-30d89d68-9be6-4663-9940-37056da63390
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b14f3153-bcb5-44bc-8f60-9eea3b533097"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a725a2f2-21fd-4ef9-a2b1-eed376ccbf62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a725a2f2-21fd-4ef9-a2b1-eed376ccbf62
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6e6c43660173","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 42 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a725a2f2-21fd-4ef9-a2b1-eed376ccbf62
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
Location: /v1/conversations/cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772","subject":"Lunch?","status":"open","region":"eu","participants":["qa-68fcaeede7b6","qa-6e6c43660173"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:22.865327051Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-5a4819c1-4834-4dea-989e-920e17931b48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a4819c1-4834-4dea-989e-920e17931b48
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6c43660173","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a4819c1-4834-4dea-989e-920e17931b48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cac8b7b7-9691-408f-bf56-e6a46099f338"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772/messages
correlation: qa-1be231f3-596b-4cc2-829b-fe1408ab72d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1be231f3-596b-4cc2-829b-fe1408ab72d8
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 16 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1be231f3-596b-4cc2-829b-fe1408ab72d8
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
Content-Length: 203

{"id":"msg_7f1fc159-f5a3-4fff-8856-78c411500ca5","conversationId":"cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772","sender":"qa-6e6c43660173","body":"Friday works","createdAt":"2026-11-14T09:05:22.946941671Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772/messages
correlation: qa-c74c0bf2-281b-41e1-9633-8f32a8fa191c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c74c0bf2-281b-41e1-9633-8f32a8fa191c
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-c74c0bf2-281b-41e1-9633-8f32a8fa191c
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
Content-Length: 432

{"items":[{"id":"msg_b9fe7386-fb32-424e-8fb1-93e970de0d00","conversationId":"cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772","sender":"qa-68fcaeede7b6","body":"Free on Friday?","createdAt":"2026-11-14T09:05:22.865569119Z"},{"id":"msg_7f1fc159-f5a3-4fff-8856-78c411500ca5","conversationId":"cnv_3ea90f16-2aa9-48e9-acbe-0b75e9b02772","sender":"qa-6e6c43660173","body":"Friday works","createdAt":"2026-11-14T09:05:22.946941671Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29fe0ca7-29d9-4851-b9bc-b7c52426491c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29fe0ca7-29d9-4851-b9bc-b7c52426491c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29fe0ca7-29d9-4851-b9bc-b7c52426491c
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-03e6cf0e-0f55-4536-b053-f952ec3f3a88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03e6cf0e-0f55-4536-b053-f952ec3f3a88
Content-Type: application/json

--- request body ---
{"handle":"qa-6e6c43660173","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03e6cf0e-0f55-4536-b053-f952ec3f3a88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03e6cf0e-0f55-4536-b053-f952ec3f3a88"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09c88a41-4d08-409b-99d7-8514e5d50a33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c88a41-4d08-409b-99d7-8514e5d50a33
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09c88a41-4d08-409b-99d7-8514e5d50a33
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-4073ba27-2812-4c01-87da-14835583f7fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4073ba27-2812-4c01-87da-14835583f7fb
Content-Type: application/json

--- request body ---
{"handle":"qa-68fcaeede7b6","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 14 Nov 2026 09:05:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4073ba27-2812-4c01-87da-14835583f7fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4073ba27-2812-4c01-87da-14835583f7fb"}
```
