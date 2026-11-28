# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 513 | `qa-1d96b145-31be-48d8-9ef9-0655f9167f13` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-c7bbafdc-a367-492d-bb82-44dadf3a5b65` |
| 3 | `POST /v1/accounts` | 201 | 36 | `qa-6ae1286e-5122-43af-bfea-9fd9f6e28c82` |
| 4 | `POST /v1/auth/token` | 200 | 56 | `qa-df046424-4806-46b6-92f4-00e0ee6ca420` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-669f6548-df3a-4d48-8da0-d503bc788ec7` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-fc15af93-e6ba-4e9a-b546-5d72cdc5fb17` |
| 7 | `GET /v1/conversations/{id}` | 403 | 32 | `qa-bfab3166-7452-4ce6-84a0-b07cb4741427` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 20 | `qa-7e9ddba0-931b-4fa9-baeb-77cddf76f7a0` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 24 | `qa-64a40209-738d-4f77-a826-8f89862d8896` |
| 10 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-9b15b5fb-6019-411a-be63-04a6676e9f59` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-2bbc3e56-ce6c-4581-850f-d5ba1ff47c7d` |
| 12 | `POST /v1/auth/token` | 200 | 24 | `qa-b214228d-4da5-45aa-a684-ed1337954ded` |
| 13 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-299c1004-025f-429f-b7dc-6506abf1cce6` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-9fabb508-8074-4445-b78c-2ab8a4f4423e` |
| 15 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-3587184a-f687-4961-a074-0ff288da5642` |
| 16 | `POST /v1/auth/token` | 401 | 7 | `qa-afa24be6-2f0a-43ec-ad29-02d5b00e325a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1d96b145-31be-48d8-9ef9-0655f9167f13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d96b145-31be-48d8-9ef9-0655f9167f13
Content-Type: application/json

--- request body ---
{"handle":"qa-519c2bf43f3c","displayName":"QA 519c2bf43f3c","password":"****","region":"eu"}

--- response: 201 in 513 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d96b145-31be-48d8-9ef9-0655f9167f13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-519c2bf43f3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_180a7e7a-6f3e-4fb1-b09b-dd54352ed9b7","handle":"qa-519c2bf43f3c","displayName":"QA 519c2bf43f3c","region":"eu","role":"user","createdAt":"2026-11-25T11:28:05.365731472Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c7bbafdc-a367-492d-bb82-44dadf3a5b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7bbafdc-a367-492d-bb82-44dadf3a5b65
Content-Type: application/json

--- request body ---
{"handle":"qa-99198bea47d2","displayName":"QA 99198bea47d2","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7bbafdc-a367-492d-bb82-44dadf3a5b65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-99198bea47d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14f19f88-853e-45ea-9b32-091752a27437","handle":"qa-99198bea47d2","displayName":"QA 99198bea47d2","region":"eu","role":"user","createdAt":"2026-11-25T11:28:05.840824027Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-6ae1286e-5122-43af-bfea-9fd9f6e28c82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ae1286e-5122-43af-bfea-9fd9f6e28c82
Content-Type: application/json

--- request body ---
{"handle":"qa-81c2df51cc25","displayName":"QA 81c2df51cc25","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ae1286e-5122-43af-bfea-9fd9f6e28c82
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
Location: /v1/accounts/qa-81c2df51cc25
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b705ba32-6569-4528-92d8-2a636a59cd2c","handle":"qa-81c2df51cc25","displayName":"QA 81c2df51cc25","region":"eu","role":"user","createdAt":"2026-11-25T11:28:05.897329571Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-df046424-4806-46b6-92f4-00e0ee6ca420

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df046424-4806-46b6-92f4-00e0ee6ca420
Content-Type: application/json

--- request body ---
{"handle":"qa-519c2bf43f3c","password":"****"}

--- response: 200 in 56 ms ---
Date: Wed, 25 Nov 2026 11:28:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-df046424-4806-46b6-92f4-00e0ee6ca420
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_180a7e7a-6f3e-4fb1-b09b-dd54352ed9b7"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-669f6548-df3a-4d48-8da0-d503bc788ec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-669f6548-df3a-4d48-8da0-d503bc788ec7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-99198bea47d2","subject":"Private","message":"Just us"}

--- response: 201 in 27 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-669f6548-df3a-4d48-8da0-d503bc788ec7
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
Location: /v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_476c56ca-d217-4bf5-983d-4f343803a9fe","subject":"Private","status":"open","region":"eu","participants":["qa-519c2bf43f3c","qa-99198bea47d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:28:06.060313786Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc15af93-e6ba-4e9a-b546-5d72cdc5fb17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc15af93-e6ba-4e9a-b546-5d72cdc5fb17
Content-Type: application/json

--- request body ---
{"handle":"qa-81c2df51cc25","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc15af93-e6ba-4e9a-b546-5d72cdc5fb17
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b705ba32-6569-4528-92d8-2a636a59cd2c"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe
correlation: qa-bfab3166-7452-4ce6-84a0-b07cb4741427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfab3166-7452-4ce6-84a0-b07cb4741427
Content-Type: application/json

--- response: 403 in 32 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bfab3166-7452-4ce6-84a0-b07cb4741427
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe","correlationId":"qa-bfab3166-7452-4ce6-84a0-b07cb4741427"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe/messages
correlation: qa-7e9ddba0-931b-4fa9-baeb-77cddf76f7a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e9ddba0-931b-4fa9-baeb-77cddf76f7a0
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e9ddba0-931b-4fa9-baeb-77cddf76f7a0
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe/messages","correlationId":"qa-7e9ddba0-931b-4fa9-baeb-77cddf76f7a0"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe/messages
correlation: qa-64a40209-738d-4f77-a826-8f89862d8896

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64a40209-738d-4f77-a826-8f89862d8896
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 24 ms ---
Date: Wed, 25 Nov 2026 11:28:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64a40209-738d-4f77-a826-8f89862d8896
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_476c56ca-d217-4bf5-983d-4f343803a9fe/messages","correlationId":"qa-64a40209-738d-4f77-a826-8f89862d8896"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b15b5fb-6019-411a-be63-04a6676e9f59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b15b5fb-6019-411a-be63-04a6676e9f59
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b15b5fb-6019-411a-be63-04a6676e9f59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2bbc3e56-ce6c-4581-850f-d5ba1ff47c7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bbc3e56-ce6c-4581-850f-d5ba1ff47c7d
Content-Type: application/json

--- request body ---
{"handle":"qa-81c2df51cc25","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bbc3e56-ce6c-4581-850f-d5ba1ff47c7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2bbc3e56-ce6c-4581-850f-d5ba1ff47c7d"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b214228d-4da5-45aa-a684-ed1337954ded

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b214228d-4da5-45aa-a684-ed1337954ded
Content-Type: application/json

--- request body ---
{"handle":"qa-99198bea47d2","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b214228d-4da5-45aa-a684-ed1337954ded
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14f19f88-853e-45ea-9b32-091752a27437"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-299c1004-025f-429f-b7dc-6506abf1cce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-299c1004-025f-429f-b7dc-6506abf1cce6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-299c1004-025f-429f-b7dc-6506abf1cce6
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9fabb508-8074-4445-b78c-2ab8a4f4423e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fabb508-8074-4445-b78c-2ab8a4f4423e
Content-Type: application/json

--- request body ---
{"handle":"qa-99198bea47d2","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fabb508-8074-4445-b78c-2ab8a4f4423e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fabb508-8074-4445-b78c-2ab8a4f4423e"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3587184a-f687-4961-a074-0ff288da5642

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3587184a-f687-4961-a074-0ff288da5642
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3587184a-f687-4961-a074-0ff288da5642
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-afa24be6-2f0a-43ec-ad29-02d5b00e325a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afa24be6-2f0a-43ec-ad29-02d5b00e325a
Content-Type: application/json

--- request body ---
{"handle":"qa-519c2bf43f3c","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:28:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-afa24be6-2f0a-43ec-ad29-02d5b00e325a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-afa24be6-2f0a-43ec-ad29-02d5b00e325a"}
```
