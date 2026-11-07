# Transcript: Every operation in the OpenAPI document answers as documented (checked per response)

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#everyOperationConformsToTheOpenApiDocument` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 23 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 345 | `qa-f43efb0f-4ada-4278-b84e-77ddea8d4591` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-12229f0d-227e-44ed-9369-e61c278adc55` |
| 3 | `GET /health` | 200 | 27 | `qa-b83bf9c1-50dc-409b-bf2a-ac335d71e6ce` |
| 4 | `POST /v1/auth/token` | 200 | 13 | `qa-11c23d40-79ad-4372-ba2e-e908cc8d611b` |
| 5 | `GET /v1/accounts/me` | 200 | 16 | `qa-d9d112f1-55e4-4226-8e50-92c58c9111b8` |
| 6 | `PATCH /v1/accounts/me` | 200 | 10 | `qa-fe34ac70-1c67-4d5a-a182-889610a92cda` |
| 7 | `GET /v1/accounts/{handle}` | 200 | 16 | `qa-9e083bde-4e1f-4d12-8f2a-9d455d569556` |
| 8 | `POST /v1/conversations` | 201 | 12 | `qa-5ce7f197-94d4-4493-b9cd-c691d107e99b` |
| 9 | `GET /v1/conversations` | 200 | 17 | `qa-3076c3df-1eb5-44d0-8413-e098327ccee6` |
| 10 | `POST /v1/auth/token` | 200 | 15 | `qa-e17bbc35-f03b-4dff-8256-1f95e25fa776` |
| 11 | `GET /v1/conversations/{id}` | 200 | 6 | `qa-949f6105-a625-4887-b050-aeee130d57ef` |
| 12 | `GET /v1/conversations/{id}/messages` | 200 | 9 | `qa-7f9ff1d4-cba3-47ce-ab5f-de407a617011` |
| 13 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-361e07e4-b764-4056-a057-66105831de01` |
| 14 | `POST /v1/conversations/{id}/read` | 200 | 9 | `qa-c04d2a3c-f2ae-4b0a-994e-1c0dc679424a` |
| 15 | `POST /v1/conversations/{id}/close` | 200 | 9 | `qa-08d0da05-ad66-48d6-b8ac-30992571f441` |
| 16 | `GET /v1/credits/balance` | 200 | 5 | `qa-c523ddae-760c-4de4-9c59-b85127ab745e` |
| 17 | `GET /v1/credits/ledger` | 200 | 7 | `qa-7c5f8ed6-b98c-4b8d-876c-e8219f50272d` |
| 18 | `POST /v1/credits/purchases` | 201 | 7 | `qa-4cbfc567-9428-4c72-bff6-418628a26188` |
| 19 | `GET /v1/admin/stats` | 403 | 8 | `qa-4b352751-4aad-4ce3-8bdf-9ef18aad0232` |
| 20 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f1a8b94a-9218-4bb6-97e4-4fd1e8195aa6` |
| 21 | `POST /v1/auth/token` | 401 | 7 | `qa-9b533091-832f-4bfa-95fd-8e184ce44bbc` |
| 22 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-f63ac6cf-ab29-4cae-9b7f-9cda92670a1d` |
| 23 | `POST /v1/auth/token` | 401 | 16 | `qa-568cc84e-aaf5-4e42-92d9-cad7f223f8f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f43efb0f-4ada-4278-b84e-77ddea8d4591

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f43efb0f-4ada-4278-b84e-77ddea8d4591
Content-Type: application/json

--- request body ---
{"handle":"qa-11e043837aa3","displayName":"QA 11e043837aa3","password":"****","region":"eu"}

--- response: 201 in 345 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-f43efb0f-4ada-4278-b84e-77ddea8d4591
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
Location: /v1/accounts/qa-11e043837aa3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50ea1e65-e179-4c56-8779-c102b80c0e10","handle":"qa-11e043837aa3","displayName":"QA 11e043837aa3","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.300291575Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12229f0d-227e-44ed-9369-e61c278adc55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12229f0d-227e-44ed-9369-e61c278adc55
Content-Type: application/json

--- request body ---
{"handle":"qa-54baac353985","displayName":"QA 54baac353985","password":"****","region":"us"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-12229f0d-227e-44ed-9369-e61c278adc55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-54baac353985
X-Served-Region: us
Content-Length: 181

{"id":"acc_98a20311-88fd-4084-9cf2-ebb1bf8cd2c2","handle":"qa-54baac353985","displayName":"QA 54baac353985","region":"us","role":"user","createdAt":"2026-11-07T08:54:56.657583480Z"}
```

## 3. GET /health

```text
#3 GET http://localhost:7070/health
correlation: qa-b83bf9c1-50dc-409b-bf2a-ac335d71e6ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b83bf9c1-50dc-409b-bf2a-ac335d71e6ce
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b83bf9c1-50dc-409b-bf2a-ac335d71e6ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Length: 95

{"status":"UP","version":"1.0.0","region":"eu","regions":["in","eu","us"],"faultsEnabled":true}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-11c23d40-79ad-4372-ba2e-e908cc8d611b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11c23d40-79ad-4372-ba2e-e908cc8d611b
Content-Type: application/json

--- request body ---
{"handle":"qa-11e043837aa3","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-11c23d40-79ad-4372-ba2e-e908cc8d611b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50ea1e65-e179-4c56-8779-c102b80c0e10"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9d112f1-55e4-4226-8e50-92c58c9111b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9d112f1-55e4-4226-8e50-92c58c9111b8
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9d112f1-55e4-4226-8e50-92c58c9111b8
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
Content-Length: 181

{"id":"acc_50ea1e65-e179-4c56-8779-c102b80c0e10","handle":"qa-11e043837aa3","displayName":"QA 11e043837aa3","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.300291575Z"}
```

## 6. PATCH /v1/accounts/me

```text
#6 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-fe34ac70-1c67-4d5a-a182-889610a92cda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe34ac70-1c67-4d5a-a182-889610a92cda
Content-Type: application/json

--- request body ---
{"displayName":"Ava Contract"}

--- response: 200 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe34ac70-1c67-4d5a-a182-889610a92cda
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
Content-Length: 178

{"id":"acc_50ea1e65-e179-4c56-8779-c102b80c0e10","handle":"qa-11e043837aa3","displayName":"Ava Contract","region":"eu","role":"user","createdAt":"2026-11-07T08:54:56.300291575Z"}
```

## 7. GET /v1/accounts/{handle}

```text
#7 GET http://localhost:7070/v1/accounts/qa-54baac353985
correlation: qa-9e083bde-4e1f-4d12-8f2a-9d455d569556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e083bde-4e1f-4d12-8f2a-9d455d569556
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e083bde-4e1f-4d12-8f2a-9d455d569556
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
Content-Length: 74

{"handle":"qa-54baac353985","displayName":"QA 54baac353985","region":"us"}
```

## 8. POST /v1/conversations

```text
#8 POST http://localhost:7070/v1/conversations
correlation: qa-5ce7f197-94d4-4493-b9cd-c691d107e99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ce7f197-94d4-4493-b9cd-c691d107e99b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-54baac353985","subject":"OpenAPI journey","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ce7f197-94d4-4493-b9cd-c691d107e99b
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
Location: /v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6
X-Data-Region: us
Content-Length: 238

{"id":"cnv_29f07667-104b-4896-9215-6161c227f5f6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11e043837aa3","qa-54baac353985"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.871189074Z"}
```

## 9. GET /v1/conversations

```text
#9 GET http://localhost:7070/v1/conversations
correlation: qa-3076c3df-1eb5-44d0-8413-e098327ccee6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3076c3df-1eb5-44d0-8413-e098327ccee6
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3076c3df-1eb5-44d0-8413-e098327ccee6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 260

{"items":[{"id":"cnv_29f07667-104b-4896-9215-6161c227f5f6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11e043837aa3","qa-54baac353985"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.871189074Z"}],"total":1}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-e17bbc35-f03b-4dff-8256-1f95e25fa776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e17bbc35-f03b-4dff-8256-1f95e25fa776
Content-Type: application/json

--- request body ---
{"handle":"qa-54baac353985","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e17bbc35-f03b-4dff-8256-1f95e25fa776
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_98a20311-88fd-4084-9cf2-ebb1bf8cd2c2"}
```

## 11. GET /v1/conversations/{id}

```text
#11 GET http://localhost:7070/v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6
correlation: qa-949f6105-a625-4887-b050-aeee130d57ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-949f6105-a625-4887-b050-aeee130d57ef
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-949f6105-a625-4887-b050-aeee130d57ef
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
X-Served-Region: us
X-Data-Region: us
Content-Length: 238

{"id":"cnv_29f07667-104b-4896-9215-6161c227f5f6","subject":"OpenAPI journey","status":"open","region":"us","participants":["qa-11e043837aa3","qa-54baac353985"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-07T08:54:56.871189074Z"}
```

## 12. GET /v1/conversations/{id}/messages

```text
#12 GET http://localhost:7070/v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6/messages
correlation: qa-7f9ff1d4-cba3-47ce-ab5f-de407a617011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f9ff1d4-cba3-47ce-ab5f-de407a617011
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f9ff1d4-cba3-47ce-ab5f-de407a617011
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
X-Served-Region: us
Content-Length: 215

{"items":[{"id":"msg_4aa6b33a-8a3f-4e4a-9b05-dc4a6a630162","conversationId":"cnv_29f07667-104b-4896-9215-6161c227f5f6","sender":"qa-11e043837aa3","body":"Hi","createdAt":"2026-11-07T08:54:56.871203846Z"}],"total":1}
```

## 13. POST /v1/conversations/{id}/messages

```text
#13 POST http://localhost:7070/v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6/messages
correlation: qa-361e07e4-b764-4056-a057-66105831de01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-361e07e4-b764-4056-a057-66105831de01
Content-Type: application/json

--- request body ---
{"body":"Reply"}

--- response: 201 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-361e07e4-b764-4056-a057-66105831de01
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
X-Served-Region: us
Content-Length: 196

{"id":"msg_55b873a3-58e9-4424-907b-a8c508919390","conversationId":"cnv_29f07667-104b-4896-9215-6161c227f5f6","sender":"qa-54baac353985","body":"Reply","createdAt":"2026-11-07T08:54:56.975225577Z"}
```

## 14. POST /v1/conversations/{id}/read

```text
#14 POST http://localhost:7070/v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6/read
correlation: qa-c04d2a3c-f2ae-4b0a-994e-1c0dc679424a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c04d2a3c-f2ae-4b0a-994e-1c0dc679424a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-c04d2a3c-f2ae-4b0a-994e-1c0dc679424a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 77

{"conversationId":"cnv_29f07667-104b-4896-9215-6161c227f5f6","unreadCount":0}
```

## 15. POST /v1/conversations/{id}/close

```text
#15 POST http://localhost:7070/v1/conversations/cnv_29f07667-104b-4896-9215-6161c227f5f6/close
correlation: qa-08d0da05-ad66-48d6-b8ac-30992571f441

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d0da05-ad66-48d6-b8ac-30992571f441
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-08d0da05-ad66-48d6-b8ac-30992571f441
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 284

{"id":"cnv_29f07667-104b-4896-9215-6161c227f5f6","subject":"OpenAPI journey","status":"closed","region":"us","participants":["qa-11e043837aa3","qa-54baac353985"],"messageCount":2,"unreadCount":0,"createdAt":"2026-11-07T08:54:56.871189074Z","closedAt":"2026-11-07T08:54:57.001534187Z"}
```

## 16. GET /v1/credits/balance

```text
#16 GET http://localhost:7070/v1/credits/balance
correlation: qa-c523ddae-760c-4de4-9c59-b85127ab745e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c523ddae-760c-4de4-9c59-b85127ab745e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c523ddae-760c-4de4-9c59-b85127ab745e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":4,"currency":"credits","accountId":"acc_50ea1e65-e179-4c56-8779-c102b80c0e10"}
```

## 17. GET /v1/credits/ledger

```text
#17 GET http://localhost:7070/v1/credits/ledger
correlation: qa-7c5f8ed6-b98c-4b8d-876c-e8219f50272d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c5f8ed6-b98c-4b8d-876c-e8219f50272d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c5f8ed6-b98c-4b8d-876c-e8219f50272d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 393

{"items":[{"id":"led_0eb84c7c-6833-4c45-be48-bd9bedae26e7","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-07T08:54:56.300518948Z"},{"id":"led_9edaa443-1e3f-4d59-82f6-8a9bcd8400b1","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_29f07667-104b-4896-9215-6161c227f5f6","createdAt":"2026-11-07T08:54:56.871168412Z"}],"total":2,"balance":4}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4cbfc567-9428-4c72-bff6-418628a26188

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6d97b1059fba4bf4941e92cc666ab588
X-Correlation-Id: qa-4cbfc567-9428-4c72-bff6-418628a26188
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cbfc567-9428-4c72-bff6-418628a26188
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_a467769b-373d-4e7c-9f35-392318ed85ac
Content-Length: 144

{"id":"pur_a467769b-373d-4e7c-9f35-392318ed85ac","packId":"pack-50","credits":50,"balanceAfter":54,"createdAt":"2026-11-07T08:54:57.042272521Z"}
```

## 19. GET /v1/admin/stats

```text
#19 GET http://localhost:7070/v1/admin/stats
correlation: qa-4b352751-4aad-4ce3-8bdf-9ef18aad0232

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b352751-4aad-4ce3-8bdf-9ef18aad0232
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b352751-4aad-4ce3-8bdf-9ef18aad0232
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 215

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"Administrators only.","instance":"/v1/admin/stats","correlationId":"qa-4b352751-4aad-4ce3-8bdf-9ef18aad0232"}
```

## 20. DELETE /v1/accounts/me

```text
#20 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1a8b94a-9218-4bb6-97e4-4fd1e8195aa6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1a8b94a-9218-4bb6-97e4-4fd1e8195aa6
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1a8b94a-9218-4bb6-97e4-4fd1e8195aa6
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
X-Served-Region: us
```

## 21. POST /v1/auth/token

```text
#21 POST http://localhost:7070/v1/auth/token
correlation: qa-9b533091-832f-4bfa-95fd-8e184ce44bbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b533091-832f-4bfa-95fd-8e184ce44bbc
Content-Type: application/json

--- request body ---
{"handle":"qa-54baac353985","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b533091-832f-4bfa-95fd-8e184ce44bbc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b533091-832f-4bfa-95fd-8e184ce44bbc"}
```

## 22. DELETE /v1/accounts/me

```text
#22 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f63ac6cf-ab29-4cae-9b7f-9cda92670a1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f63ac6cf-ab29-4cae-9b7f-9cda92670a1d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f63ac6cf-ab29-4cae-9b7f-9cda92670a1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
```

## 23. POST /v1/auth/token

```text
#23 POST http://localhost:7070/v1/auth/token
correlation: qa-568cc84e-aaf5-4e42-92d9-cad7f223f8f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-568cc84e-aaf5-4e42-92d9-cad7f223f8f5
Content-Type: application/json

--- request body ---
{"handle":"qa-11e043837aa3","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-568cc84e-aaf5-4e42-92d9-cad7f223f8f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-568cc84e-aaf5-4e42-92d9-cad7f223f8f5"}
```
