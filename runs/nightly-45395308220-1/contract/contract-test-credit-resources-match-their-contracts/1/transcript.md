# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 7 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 370 | `qa-48b086e6-80cd-4956-a185-11b95acdddf5` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-dad69292-2eca-4670-934a-6e2f0a6f4729` |
| 3 | `GET /v1/credits/balance` | 200 | 32 | `qa-99359831-d909-471d-8c4f-2313f817a1f4` |
| 4 | `POST /v1/credits/purchases` | 201 | 25 | `qa-a444724c-f087-436e-a521-73728851c4cc` |
| 5 | `GET /v1/credits/ledger` | 200 | 27 | `qa-836645b5-55ff-4611-b225-7eb5e885f7c5` |
| 6 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0ac942ac-dfb2-44a8-a320-13dfc536cce3` |
| 7 | `POST /v1/auth/token` | 401 | 20 | `qa-ac41b470-647f-420b-a5e2-5bf240920a9c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48b086e6-80cd-4956-a185-11b95acdddf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48b086e6-80cd-4956-a185-11b95acdddf5
Content-Type: application/json

--- request body ---
{"handle":"qa-4827e505b1d9","displayName":"QA 4827e505b1d9","password":"****","region":"in"}

--- response: 201 in 370 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-48b086e6-80cd-4956-a185-11b95acdddf5
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
Location: /v1/accounts/qa-4827e505b1d9
X-Served-Region: in
Content-Length: 181

{"id":"acc_4a6321cb-b59a-4261-9b19-eb9c96a57c64","handle":"qa-4827e505b1d9","displayName":"QA 4827e505b1d9","region":"in","role":"user","createdAt":"2026-11-24T12:38:12.218358911Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-dad69292-2eca-4670-934a-6e2f0a6f4729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad69292-2eca-4670-934a-6e2f0a6f4729
Content-Type: application/json

--- request body ---
{"handle":"qa-4827e505b1d9","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dad69292-2eca-4670-934a-6e2f0a6f4729
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4a6321cb-b59a-4261-9b19-eb9c96a57c64"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-99359831-d909-471d-8c4f-2313f817a1f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99359831-d909-471d-8c4f-2313f817a1f4
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-99359831-d909-471d-8c4f-2313f817a1f4
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
X-Served-Region: in
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_4a6321cb-b59a-4261-9b19-eb9c96a57c64"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a444724c-f087-436e-a521-73728851c4cc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-30478a3205d04bcca3e39ae651d41a24
X-Correlation-Id: qa-a444724c-f087-436e-a521-73728851c4cc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 25 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a444724c-f087-436e-a521-73728851c4cc
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
X-Served-Region: in
Location: /v1/credits/purchases/pur_99561740-344d-4011-8492-667353b314f8
Content-Length: 144

{"id":"pur_99561740-344d-4011-8492-667353b314f8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:38:12.791267310Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-836645b5-55ff-4611-b225-7eb5e885f7c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-836645b5-55ff-4611-b225-7eb5e885f7c5
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-836645b5-55ff-4611-b225-7eb5e885f7c5
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
X-Served-Region: in
Content-Length: 398

{"items":[{"id":"led_abd70616-c1cf-4add-a24c-2bc6df9605b8","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-24T12:38:12.218373379Z"},{"id":"led_f6605508-4835-4981-8df0-897bfc48c6ec","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_99561740-344d-4011-8492-667353b314f8","createdAt":"2026-11-24T12:38:12.791267310Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ac942ac-dfb2-44a8-a320-13dfc536cce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac942ac-dfb2-44a8-a320-13dfc536cce3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ac942ac-dfb2-44a8-a320-13dfc536cce3
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
X-Served-Region: in
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-ac41b470-647f-420b-a5e2-5bf240920a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac41b470-647f-420b-a5e2-5bf240920a9c
Content-Type: application/json

--- request body ---
{"handle":"qa-4827e505b1d9","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ac41b470-647f-420b-a5e2-5bf240920a9c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ac41b470-647f-420b-a5e2-5bf240920a9c"}
```
