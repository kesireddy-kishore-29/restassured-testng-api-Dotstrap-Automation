# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-3022c616-17c9-4363-86aa-d39c72ac3f56` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-3262b858-b1b2-4d57-ad9c-28aef9852531` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-3655840c-f3cd-4ffa-9902-d841dd471764` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-b0eafd0b-a587-408d-9943-80f600b1cf9f` |
| 5 | `PATCH /v1/accounts/me` | 422 | 25 | `qa-1d0b04e4-9e9a-4637-aa8f-0a0eb4659c61` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-67ebd629-abf7-40a4-838c-f94dcdbe7eea` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-7a49a347-6ac1-4375-876b-f404c65cd405` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-e3b46028-655d-4d99-a35d-6b3bcb0932d6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-731eb079-fc0e-4e36-bdc9-68506a6dfa85` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-d8564442-adb6-482e-93a4-e2a57ce75f0b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3022c616-17c9-4363-86aa-d39c72ac3f56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3022c616-17c9-4363-86aa-d39c72ac3f56
Content-Type: application/json

--- request body ---
{"handle":"qa-8c128e14a652","displayName":"QA 8c128e14a652","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3022c616-17c9-4363-86aa-d39c72ac3f56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Location: /v1/accounts/qa-8c128e14a652
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2441f129-fba5-4706-be04-29e594fa4af9","handle":"qa-8c128e14a652","displayName":"QA 8c128e14a652","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.632326505Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3262b858-b1b2-4d57-ad9c-28aef9852531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3262b858-b1b2-4d57-ad9c-28aef9852531
Content-Type: application/json

--- request body ---
{"handle":"qa-48c01497566d","displayName":"QA 48c01497566d","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3262b858-b1b2-4d57-ad9c-28aef9852531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Location: /v1/accounts/qa-48c01497566d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3cc76290-ade7-441c-82cb-65474caf13f7","handle":"qa-48c01497566d","displayName":"QA 48c01497566d","region":"eu","role":"user","createdAt":"2026-11-10T09:59:36.679261538Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3655840c-f3cd-4ffa-9902-d841dd471764

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3655840c-f3cd-4ffa-9902-d841dd471764
Content-Type: application/json

--- request body ---
{"handle":"qa-8c128e14a652","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3655840c-f3cd-4ffa-9902-d841dd471764
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2441f129-fba5-4706-be04-29e594fa4af9"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b0eafd0b-a587-408d-9943-80f600b1cf9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0eafd0b-a587-408d-9943-80f600b1cf9f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-48c01497566d","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0eafd0b-a587-408d-9943-80f600b1cf9f
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
Location: /v1/conversations/cnv_335b8c8d-84f9-441a-82d9-2f03377a97cf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_335b8c8d-84f9-441a-82d9-2f03377a97cf","subject":"Error contract","status":"open","region":"eu","participants":["qa-8c128e14a652","qa-48c01497566d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:36.772513106Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-1d0b04e4-9e9a-4637-aa8f-0a0eb4659c61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d0b04e4-9e9a-4637-aa8f-0a0eb4659c61
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 25 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d0b04e4-9e9a-4637-aa8f-0a0eb4659c61
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-1d0b04e4-9e9a-4637-aa8f-0a0eb4659c61","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-67ebd629-abf7-40a4-838c-f94dcdbe7eea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67ebd629-abf7-40a4-838c-f94dcdbe7eea
Content-Type: application/json

--- request body ---
{"handle":"qa-48c01497566d","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-67ebd629-abf7-40a4-838c-f94dcdbe7eea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3cc76290-ade7-441c-82cb-65474caf13f7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a49a347-6ac1-4375-876b-f404c65cd405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a49a347-6ac1-4375-876b-f404c65cd405
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a49a347-6ac1-4375-876b-f404c65cd405
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
correlation: qa-e3b46028-655d-4d99-a35d-6b3bcb0932d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b46028-655d-4d99-a35d-6b3bcb0932d6
Content-Type: application/json

--- request body ---
{"handle":"qa-48c01497566d","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e3b46028-655d-4d99-a35d-6b3bcb0932d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e3b46028-655d-4d99-a35d-6b3bcb0932d6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-731eb079-fc0e-4e36-bdc9-68506a6dfa85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-731eb079-fc0e-4e36-bdc9-68506a6dfa85
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-731eb079-fc0e-4e36-bdc9-68506a6dfa85
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
correlation: qa-d8564442-adb6-482e-93a4-e2a57ce75f0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8564442-adb6-482e-93a4-e2a57ce75f0b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c128e14a652","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8564442-adb6-482e-93a4-e2a57ce75f0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8564442-adb6-482e-93a4-e2a57ce75f0b"}
```
