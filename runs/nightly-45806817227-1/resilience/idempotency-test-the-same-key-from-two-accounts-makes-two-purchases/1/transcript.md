# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 291 | `qa-192210e1-0f05-495f-9cfd-d2b5fac3695d` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-6b76f70f-cd69-4d59-924c-d2307df74d91` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-016edabe-f4a5-4e9d-a165-59ed72736b9c` |
| 4 | `POST /v1/credits/purchases` | 201 | 26 | `qa-5a089202-da3b-49d1-ac18-7e37bcb4c5f8` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-ec17f2b7-c8ee-4c0f-bcf9-13cc6a0d4978` |
| 6 | `POST /v1/credits/purchases` | 201 | 29 | `qa-4b660bde-40a7-4cbc-ab12-0103987940fe` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-234f7919-74fd-4546-82ab-414dc583540f` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-4c0c6ba3-6ec7-4e99-a7c7-c0c13269c5aa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-4839dae2-694c-45e1-a69e-0cb3c90df546` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-b63f110c-1c3c-4086-8ce7-58803d391a48` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-192210e1-0f05-495f-9cfd-d2b5fac3695d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192210e1-0f05-495f-9cfd-d2b5fac3695d
Content-Type: application/json

--- request body ---
{"handle":"qa-553efb793faf","displayName":"QA 553efb793faf","password":"****","region":"eu"}

--- response: 201 in 291 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-192210e1-0f05-495f-9cfd-d2b5fac3695d
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
Location: /v1/accounts/qa-553efb793faf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48e11e10-8b76-4efe-add8-32ccec4f5fc8","handle":"qa-553efb793faf","displayName":"QA 553efb793faf","region":"eu","role":"user","createdAt":"2026-11-26T11:02:29.567171961Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b76f70f-cd69-4d59-924c-d2307df74d91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b76f70f-cd69-4d59-924c-d2307df74d91
Content-Type: application/json

--- request body ---
{"handle":"qa-46edd66e6cad","displayName":"QA 46edd66e6cad","password":"****","region":"us"}

--- response: 201 in 40 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b76f70f-cd69-4d59-924c-d2307df74d91
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
Location: /v1/accounts/qa-46edd66e6cad
X-Served-Region: us
Content-Length: 181

{"id":"acc_904b06ab-5242-4093-86dd-7c3b9055f494","handle":"qa-46edd66e6cad","displayName":"QA 46edd66e6cad","region":"us","role":"user","createdAt":"2026-11-26T11:02:29.859068915Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-016edabe-f4a5-4e9d-a165-59ed72736b9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-016edabe-f4a5-4e9d-a165-59ed72736b9c
Content-Type: application/json

--- request body ---
{"handle":"qa-553efb793faf","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-016edabe-f4a5-4e9d-a165-59ed72736b9c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48e11e10-8b76-4efe-add8-32ccec4f5fc8"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5a089202-da3b-49d1-ac18-7e37bcb4c5f8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0ebfa8466a6e42c7b4051089d1b00a54
X-Correlation-Id: qa-5a089202-da3b-49d1-ac18-7e37bcb4c5f8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a089202-da3b-49d1-ac18-7e37bcb4c5f8
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
Location: /v1/credits/purchases/pur_ba75b207-865e-4814-b0da-19313932479e
Content-Length: 144

{"id":"pur_ba75b207-865e-4814-b0da-19313932479e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:29.949293817Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ec17f2b7-c8ee-4c0f-bcf9-13cc6a0d4978

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec17f2b7-c8ee-4c0f-bcf9-13cc6a0d4978
Content-Type: application/json

--- request body ---
{"handle":"qa-46edd66e6cad","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec17f2b7-c8ee-4c0f-bcf9-13cc6a0d4978
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_904b06ab-5242-4093-86dd-7c3b9055f494"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4b660bde-40a7-4cbc-ab12-0103987940fe

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0ebfa8466a6e42c7b4051089d1b00a54
X-Correlation-Id: qa-4b660bde-40a7-4cbc-ab12-0103987940fe
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b660bde-40a7-4cbc-ab12-0103987940fe
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
Location: /v1/credits/purchases/pur_19777db4-3cda-44fc-b57f-fa9cb88e0c5f
Content-Length: 144

{"id":"pur_19777db4-3cda-44fc-b57f-fa9cb88e0c5f","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-26T11:02:30.024980464Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-234f7919-74fd-4546-82ab-414dc583540f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-234f7919-74fd-4546-82ab-414dc583540f
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-234f7919-74fd-4546-82ab-414dc583540f
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-4c0c6ba3-6ec7-4e99-a7c7-c0c13269c5aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c0c6ba3-6ec7-4e99-a7c7-c0c13269c5aa
Content-Type: application/json

--- request body ---
{"handle":"qa-46edd66e6cad","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c0c6ba3-6ec7-4e99-a7c7-c0c13269c5aa
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c0c6ba3-6ec7-4e99-a7c7-c0c13269c5aa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4839dae2-694c-45e1-a69e-0cb3c90df546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4839dae2-694c-45e1-a69e-0cb3c90df546
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4839dae2-694c-45e1-a69e-0cb3c90df546
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
correlation: qa-b63f110c-1c3c-4086-8ce7-58803d391a48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b63f110c-1c3c-4086-8ce7-58803d391a48
Content-Type: application/json

--- request body ---
{"handle":"qa-553efb793faf","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b63f110c-1c3c-4086-8ce7-58803d391a48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b63f110c-1c3c-4086-8ce7-58803d391a48"}
```
