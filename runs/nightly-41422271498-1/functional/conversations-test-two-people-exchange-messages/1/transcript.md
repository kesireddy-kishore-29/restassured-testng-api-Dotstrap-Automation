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
| 1 | `POST /v1/accounts` | 201 | 306 | `qa-70df9872-35ff-49da-af37-e573806e0c04` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-2d276052-43c0-4422-bbb9-1d34f8434283` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-c0242eac-a06b-4168-8f9d-53fe38e8da8f` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-f9ae01c4-f09d-4782-bf58-62fd87fac4e7` |
| 5 | `POST /v1/auth/token` | 200 | 14 | `qa-c16c0cd9-b205-4810-92af-d4abe1ac864c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-8599fa8a-558f-4ed5-ad38-6e14927a93c7` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 13 | `qa-d3f60c91-5507-45fd-9eea-a4dd30e5d179` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-5493467f-6dfe-4b97-b4a3-db05cb2edad5` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-80b52754-1faa-4525-88c5-10e3ab3cd178` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-eb9759d1-08af-45d8-88c4-aa2b13804461` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-d45ecc72-8720-428c-95b8-f95a95defb56` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70df9872-35ff-49da-af37-e573806e0c04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70df9872-35ff-49da-af37-e573806e0c04
Content-Type: application/json

--- request body ---
{"handle":"qa-6501bdce8bf3","displayName":"QA 6501bdce8bf3","password":"****","region":"eu"}

--- response: 201 in 306 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-70df9872-35ff-49da-af37-e573806e0c04
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
Location: /v1/accounts/qa-6501bdce8bf3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2d511c3e-6a04-4beb-b0b1-d91284622194","handle":"qa-6501bdce8bf3","displayName":"QA 6501bdce8bf3","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.652507375Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2d276052-43c0-4422-bbb9-1d34f8434283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d276052-43c0-4422-bbb9-1d34f8434283
Content-Type: application/json

--- request body ---
{"handle":"qa-12fac4bd9447","displayName":"QA 12fac4bd9447","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d276052-43c0-4422-bbb9-1d34f8434283
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-12fac4bd9447
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5cac7240-bc5c-42c9-a130-b539e8b79371","handle":"qa-12fac4bd9447","displayName":"QA 12fac4bd9447","region":"eu","role":"user","createdAt":"2026-11-02T09:38:44.943789669Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c0242eac-a06b-4168-8f9d-53fe38e8da8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0242eac-a06b-4168-8f9d-53fe38e8da8f
Content-Type: application/json

--- request body ---
{"handle":"qa-6501bdce8bf3","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0242eac-a06b-4168-8f9d-53fe38e8da8f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2d511c3e-6a04-4beb-b0b1-d91284622194"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f9ae01c4-f09d-4782-bf58-62fd87fac4e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9ae01c4-f09d-4782-bf58-62fd87fac4e7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12fac4bd9447","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 42 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9ae01c4-f09d-4782-bf58-62fd87fac4e7
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
Location: /v1/conversations/cnv_30041771-55b5-458b-95e2-286c2f22cbb5
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_30041771-55b5-458b-95e2-286c2f22cbb5","subject":"Lunch?","status":"open","region":"eu","participants":["qa-6501bdce8bf3","qa-12fac4bd9447"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:45.053149361Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c16c0cd9-b205-4810-92af-d4abe1ac864c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c16c0cd9-b205-4810-92af-d4abe1ac864c
Content-Type: application/json

--- request body ---
{"handle":"qa-12fac4bd9447","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-c16c0cd9-b205-4810-92af-d4abe1ac864c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5cac7240-bc5c-42c9-a130-b539e8b79371"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_30041771-55b5-458b-95e2-286c2f22cbb5/messages
correlation: qa-8599fa8a-558f-4ed5-ad38-6e14927a93c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8599fa8a-558f-4ed5-ad38-6e14927a93c7
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-8599fa8a-558f-4ed5-ad38-6e14927a93c7
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

{"id":"msg_6831cbbb-69a7-43ac-bf8a-3bf2e98b8e67","conversationId":"cnv_30041771-55b5-458b-95e2-286c2f22cbb5","sender":"qa-12fac4bd9447","body":"Friday works","createdAt":"2026-11-02T09:38:45.132412840Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_30041771-55b5-458b-95e2-286c2f22cbb5/messages
correlation: qa-d3f60c91-5507-45fd-9eea-a4dd30e5d179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3f60c91-5507-45fd-9eea-a4dd30e5d179
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3f60c91-5507-45fd-9eea-a4dd30e5d179
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

{"items":[{"id":"msg_34525171-a49f-4977-97b2-479c691fa7c7","conversationId":"cnv_30041771-55b5-458b-95e2-286c2f22cbb5","sender":"qa-6501bdce8bf3","body":"Free on Friday?","createdAt":"2026-11-02T09:38:45.053373915Z"},{"id":"msg_6831cbbb-69a7-43ac-bf8a-3bf2e98b8e67","conversationId":"cnv_30041771-55b5-458b-95e2-286c2f22cbb5","sender":"qa-12fac4bd9447","body":"Friday works","createdAt":"2026-11-02T09:38:45.132412840Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5493467f-6dfe-4b97-b4a3-db05cb2edad5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5493467f-6dfe-4b97-b4a3-db05cb2edad5
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5493467f-6dfe-4b97-b4a3-db05cb2edad5
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
correlation: qa-80b52754-1faa-4525-88c5-10e3ab3cd178

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80b52754-1faa-4525-88c5-10e3ab3cd178
Content-Type: application/json

--- request body ---
{"handle":"qa-12fac4bd9447","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-80b52754-1faa-4525-88c5-10e3ab3cd178
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-80b52754-1faa-4525-88c5-10e3ab3cd178"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb9759d1-08af-45d8-88c4-aa2b13804461

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb9759d1-08af-45d8-88c4-aa2b13804461
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb9759d1-08af-45d8-88c4-aa2b13804461
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
correlation: qa-d45ecc72-8720-428c-95b8-f95a95defb56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d45ecc72-8720-428c-95b8-f95a95defb56
Content-Type: application/json

--- request body ---
{"handle":"qa-6501bdce8bf3","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 02 Nov 2026 09:38:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d45ecc72-8720-428c-95b8-f95a95defb56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d45ecc72-8720-428c-95b8-f95a95defb56"}
```
