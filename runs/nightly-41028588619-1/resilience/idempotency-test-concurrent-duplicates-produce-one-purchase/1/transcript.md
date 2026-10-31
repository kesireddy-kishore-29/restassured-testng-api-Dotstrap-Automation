# Transcript: Six concurrent duplicates: one purchase, five replays, one charge

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 17 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-472de407-5aac-42de-bd8e-ebdeffad6b0b` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-d8aa2902-081b-4146-8291-73dce11b4c57` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-bf4e786f-f64f-42cf-ba76-91011c944b92` |
| 5 | `POST /v1/auth/token` | 200 | 43 | `qa-693c4a5d-9dff-4136-8e7f-9c11e17f0741` |
| 7 | `POST /v1/auth/token` | 200 | 47 | `qa-9076fade-036c-4b3c-b3a9-04042eafcfa9` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-34dea0ae-a663-4425-81c8-0283dcb55fb7` |
| 2 | `POST /v1/auth/token` | 200 | 57 | `qa-1cf3339b-bebd-4392-a9d9-f76b7f94aa9f` |
| 11 | `POST /v1/credits/purchases` | 201 | 32 | `qa-8852d154-4524-4a0f-bc91-559f5c3c5ead` |
| 8 | `POST /v1/credits/purchases` | 200 | 36 | `qa-ac375905-d70c-4524-b6b3-e07e6e68b338` |
| 9 | `POST /v1/credits/purchases` | 200 | 37 | `qa-286ef7a0-86ec-44f1-ab09-af81f58bd782` |
| 10 | `POST /v1/credits/purchases` | 200 | 36 | `qa-539f3092-6278-47f8-9203-c19d54abec74` |
| 12 | `POST /v1/credits/purchases` | 200 | 31 | `qa-ed0d4d68-c8b0-40eb-915d-3d40b28be272` |
| 13 | `POST /v1/credits/purchases` | 200 | 30 | `qa-e34908d7-a470-4878-a63e-63ad9562e164` |
| 14 | `POST /v1/auth/token` | 200 | 9 | `qa-3ce7aa7f-0548-4464-b4ff-32f02fb32e54` |
| 15 | `GET /v1/credits/balance` | 200 | 10 | `qa-efba81ba-b188-40e0-a383-537a590d8a29` |
| 16 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-71f4841d-bdb5-4a9d-94c2-fb1f7c75d121` |
| 17 | `POST /v1/auth/token` | 401 | 9 | `qa-45e283d2-3b6a-4bc7-a9b2-fce1b81b5267` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-472de407-5aac-42de-bd8e-ebdeffad6b0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-472de407-5aac-42de-bd8e-ebdeffad6b0b
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","displayName":"QA a62210c54f26","password":"****","region":"eu"}

--- response: 201 in 310 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-472de407-5aac-42de-bd8e-ebdeffad6b0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a62210c54f26
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b","handle":"qa-a62210c54f26","displayName":"QA a62210c54f26","region":"eu","role":"user","createdAt":"2026-10-30T08:45:48.628209038Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d8aa2902-081b-4146-8291-73dce11b4c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8aa2902-081b-4146-8291-73dce11b4c57
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8aa2902-081b-4146-8291-73dce11b4c57
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf4e786f-f64f-42cf-ba76-91011c944b92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf4e786f-f64f-42cf-ba76-91011c944b92
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf4e786f-f64f-42cf-ba76-91011c944b92
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-693c4a5d-9dff-4136-8e7f-9c11e17f0741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-693c4a5d-9dff-4136-8e7f-9c11e17f0741
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-693c4a5d-9dff-4136-8e7f-9c11e17f0741
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-9076fade-036c-4b3c-b3a9-04042eafcfa9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9076fade-036c-4b3c-b3a9-04042eafcfa9
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 47 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9076fade-036c-4b3c-b3a9-04042eafcfa9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34dea0ae-a663-4425-81c8-0283dcb55fb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34dea0ae-a663-4425-81c8-0283dcb55fb7
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-34dea0ae-a663-4425-81c8-0283dcb55fb7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1cf3339b-bebd-4392-a9d9-f76b7f94aa9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cf3339b-bebd-4392-a9d9-f76b7f94aa9f
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 57 ms ---
Date: Fri, 30 Oct 2026 08:45:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cf3339b-bebd-4392-a9d9-f76b7f94aa9f
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8852d154-4524-4a0f-bc91-559f5c3c5ead

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-8852d154-4524-4a0f-bc91-559f5c3c5ead
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 32 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8852d154-4524-4a0f-bc91-559f5c3c5ead
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ac375905-d70c-4524-b6b3-e07e6e68b338

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-ac375905-d70c-4524-b6b3-e07e6e68b338
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 36 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac375905-d70c-4524-b6b3-e07e6e68b338
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-286ef7a0-86ec-44f1-ab09-af81f58bd782

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-286ef7a0-86ec-44f1-ab09-af81f58bd782
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 37 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-286ef7a0-86ec-44f1-ab09-af81f58bd782
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-539f3092-6278-47f8-9203-c19d54abec74

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-539f3092-6278-47f8-9203-c19d54abec74
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 36 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-539f3092-6278-47f8-9203-c19d54abec74
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ed0d4d68-c8b0-40eb-915d-3d40b28be272

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-ed0d4d68-c8b0-40eb-915d-3d40b28be272
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed0d4d68-c8b0-40eb-915d-3d40b28be272
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e34908d7-a470-4878-a63e-63ad9562e164

--- request headers ---
Accept: application/json
Idempotency-Key: qa-fa5ad5d837744c68beb50e572ee25923
X-Correlation-Id: qa-e34908d7-a470-4878-a63e-63ad9562e164
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e34908d7-a470-4878-a63e-63ad9562e164
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
Location: /v1/credits/purchases/pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_dc28c3a5-7515-48c4-b3d7-ff1e4e3b75ae","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-30T08:45:49.062795435Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3ce7aa7f-0548-4464-b4ff-32f02fb32e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ce7aa7f-0548-4464-b4ff-32f02fb32e54
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 200 in 9 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ce7aa7f-0548-4464-b4ff-32f02fb32e54
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-efba81ba-b188-40e0-a383-537a590d8a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efba81ba-b188-40e0-a383-537a590d8a29
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-efba81ba-b188-40e0-a383-537a590d8a29
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_36e7f975-a8b4-49a9-9c79-bd715b94939b"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71f4841d-bdb5-4a9d-94c2-fb1f7c75d121

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71f4841d-bdb5-4a9d-94c2-fb1f7c75d121
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71f4841d-bdb5-4a9d-94c2-fb1f7c75d121
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

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-45e283d2-3b6a-4bc7-a9b2-fce1b81b5267

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e283d2-3b6a-4bc7-a9b2-fce1b81b5267
Content-Type: application/json

--- request body ---
{"handle":"qa-a62210c54f26","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 30 Oct 2026 08:45:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45e283d2-3b6a-4bc7-a9b2-fce1b81b5267
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45e283d2-3b6a-4bc7-a9b2-fce1b81b5267"}
```
