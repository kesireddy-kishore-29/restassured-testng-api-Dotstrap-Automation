# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 487 | `qa-5f16e028-a36c-4196-a704-dd5919baca3c` |
| 2 | `POST /v1/accounts` | 201 | 76 | `qa-6a8837b2-cffb-4ca0-9a46-0d37a2e57d65` |
| 3 | `POST /v1/accounts` | 201 | 41 | `qa-5acd82a4-a267-478f-b672-8087100fca69` |
| 4 | `POST /v1/auth/token` | 200 | 54 | `qa-0423e6da-7650-42dc-bc34-0e1272e1ef74` |
| 5 | `POST /v1/conversations` | 201 | 76 | `qa-f5da7627-57bb-45f7-aca0-33cdb7c8edbf` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-02db3fce-4a42-4bed-baaf-fd25477827f4` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 28 | `qa-66625f3e-a14d-46bd-98d0-1c83e1c66f0f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 37 | `qa-b53e8873-ed5a-4193-8456-f6616581fe31` |
| 9 | `POST /v1/auth/token` | 401 | 27 | `qa-4fa37588-d432-4251-b2f5-c5244436f57e` |
| 10 | `POST /v1/auth/token` | 200 | 47 | `qa-eff548be-fdde-463b-b052-bcdd5e4f00b8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-72403878-9104-4e35-af71-6392c4db58e6` |
| 12 | `POST /v1/auth/token` | 401 | 39 | `qa-55bc458e-024a-4b88-bd54-d502f168f63b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-dfb4c0c8-52be-4f8f-bff6-27938b9c4201` |
| 14 | `POST /v1/auth/token` | 401 | 29 | `qa-9b95b1ff-3b6b-4fd8-be66-f90ff2c419e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f16e028-a36c-4196-a704-dd5919baca3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f16e028-a36c-4196-a704-dd5919baca3c
Content-Type: application/json

--- request body ---
{"handle":"qa-0c824e8e7468","displayName":"QA 0c824e8e7468","password":"****","region":"eu"}

--- response: 201 in 487 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f16e028-a36c-4196-a704-dd5919baca3c
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
Location: /v1/accounts/qa-0c824e8e7468
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e48c968-daf3-451b-867c-fe10a9102e0d","handle":"qa-0c824e8e7468","displayName":"QA 0c824e8e7468","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.638004569Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a8837b2-cffb-4ca0-9a46-0d37a2e57d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a8837b2-cffb-4ca0-9a46-0d37a2e57d65
Content-Type: application/json

--- request body ---
{"handle":"qa-cdc58929f084","displayName":"QA cdc58929f084","password":"****","region":"eu"}

--- response: 201 in 76 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a8837b2-cffb-4ca0-9a46-0d37a2e57d65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-cdc58929f084
X-Served-Region: eu
Content-Length: 181

{"id":"acc_16023ac9-8f94-40f7-8a40-dbf09102c996","handle":"qa-cdc58929f084","displayName":"QA cdc58929f084","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.151452420Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5acd82a4-a267-478f-b672-8087100fca69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5acd82a4-a267-478f-b672-8087100fca69
Content-Type: application/json

--- request body ---
{"handle":"qa-31f5f57c4276","displayName":"QA 31f5f57c4276","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5acd82a4-a267-478f-b672-8087100fca69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-31f5f57c4276
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59b85a5f-43cb-4477-afb8-22fa74c62637","handle":"qa-31f5f57c4276","displayName":"QA 31f5f57c4276","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.213823828Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0423e6da-7650-42dc-bc34-0e1272e1ef74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0423e6da-7650-42dc-bc34-0e1272e1ef74
Content-Type: application/json

--- request body ---
{"handle":"qa-0c824e8e7468","password":"****"}

--- response: 200 in 54 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0423e6da-7650-42dc-bc34-0e1272e1ef74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e48c968-daf3-451b-867c-fe10a9102e0d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f5da7627-57bb-45f7-aca0-33cdb7c8edbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5da7627-57bb-45f7-aca0-33cdb7c8edbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cdc58929f084","subject":"Error contract","message":"Hi"}

--- response: 201 in 76 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5da7627-57bb-45f7-aca0-33cdb7c8edbf
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
Location: /v1/conversations/cnv_aa019434-e02f-40a0-b343-5ef2c67aab41
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa019434-e02f-40a0-b343-5ef2c67aab41","subject":"Error contract","status":"open","region":"eu","participants":["qa-0c824e8e7468","qa-cdc58929f084"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.463812084Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02db3fce-4a42-4bed-baaf-fd25477827f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02db3fce-4a42-4bed-baaf-fd25477827f4
Content-Type: application/json

--- request body ---
{"handle":"qa-31f5f57c4276","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-02db3fce-4a42-4bed-baaf-fd25477827f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59b85a5f-43cb-4477-afb8-22fa74c62637"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_aa019434-e02f-40a0-b343-5ef2c67aab41/read
correlation: qa-66625f3e-a14d-46bd-98d0-1c83e1c66f0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66625f3e-a14d-46bd-98d0-1c83e1c66f0f
Content-Type: application/json

--- response: 403 in 28 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66625f3e-a14d-46bd-98d0-1c83e1c66f0f
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_aa019434-e02f-40a0-b343-5ef2c67aab41/read","correlationId":"qa-66625f3e-a14d-46bd-98d0-1c83e1c66f0f"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b53e8873-ed5a-4193-8456-f6616581fe31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b53e8873-ed5a-4193-8456-f6616581fe31
Content-Type: application/json

--- response: 204 in 37 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b53e8873-ed5a-4193-8456-f6616581fe31
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
correlation: qa-4fa37588-d432-4251-b2f5-c5244436f57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fa37588-d432-4251-b2f5-c5244436f57e
Content-Type: application/json

--- request body ---
{"handle":"qa-31f5f57c4276","password":"****"}

--- response: 401 in 27 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fa37588-d432-4251-b2f5-c5244436f57e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fa37588-d432-4251-b2f5-c5244436f57e"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-eff548be-fdde-463b-b052-bcdd5e4f00b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eff548be-fdde-463b-b052-bcdd5e4f00b8
Content-Type: application/json

--- request body ---
{"handle":"qa-cdc58929f084","password":"****"}

--- response: 200 in 47 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-eff548be-fdde-463b-b052-bcdd5e4f00b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_16023ac9-8f94-40f7-8a40-dbf09102c996"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72403878-9104-4e35-af71-6392c4db58e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72403878-9104-4e35-af71-6392c4db58e6
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72403878-9104-4e35-af71-6392c4db58e6
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-55bc458e-024a-4b88-bd54-d502f168f63b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55bc458e-024a-4b88-bd54-d502f168f63b
Content-Type: application/json

--- request body ---
{"handle":"qa-cdc58929f084","password":"****"}

--- response: 401 in 39 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55bc458e-024a-4b88-bd54-d502f168f63b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-55bc458e-024a-4b88-bd54-d502f168f63b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dfb4c0c8-52be-4f8f-bff6-27938b9c4201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfb4c0c8-52be-4f8f-bff6-27938b9c4201
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dfb4c0c8-52be-4f8f-bff6-27938b9c4201
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-9b95b1ff-3b6b-4fd8-be66-f90ff2c419e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b95b1ff-3b6b-4fd8-be66-f90ff2c419e5
Content-Type: application/json

--- request body ---
{"handle":"qa-0c824e8e7468","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b95b1ff-3b6b-4fd8-be66-f90ff2c419e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b95b1ff-3b6b-4fd8-be66-f90ff2c419e5"}
```
