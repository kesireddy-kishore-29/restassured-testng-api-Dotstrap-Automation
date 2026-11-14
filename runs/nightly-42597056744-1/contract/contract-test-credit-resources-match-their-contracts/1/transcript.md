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
| 1 | `POST /v1/accounts` | 201 | 306 | `qa-8f6860b2-15d4-408f-99c8-01933afde5fb` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-d6ad22a1-5154-4861-8086-5ad5825c4a8b` |
| 3 | `GET /v1/credits/balance` | 200 | 33 | `qa-391c7961-88cf-4b88-85db-0ee1dc28f96e` |
| 4 | `POST /v1/credits/purchases` | 201 | 37 | `qa-06ce6500-6aa0-49d1-a737-80816c56864a` |
| 5 | `GET /v1/credits/ledger` | 200 | 16 | `qa-75959a4d-d7a4-4f18-ace3-48a2c212ae9f` |
| 6 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c8689375-6b49-4557-be73-c82106d03507` |
| 7 | `POST /v1/auth/token` | 401 | 27 | `qa-8b5fce1c-aa21-4acf-bb6f-cf20c22e466b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f6860b2-15d4-408f-99c8-01933afde5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f6860b2-15d4-408f-99c8-01933afde5fb
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3051c4e2f5","displayName":"QA ce3051c4e2f5","password":"****","region":"in"}

--- response: 201 in 306 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f6860b2-15d4-408f-99c8-01933afde5fb
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
Location: /v1/accounts/qa-ce3051c4e2f5
X-Served-Region: in
Content-Length: 181

{"id":"acc_511bd98d-d6b0-458c-abd6-75551ca3a57a","handle":"qa-ce3051c4e2f5","displayName":"QA ce3051c4e2f5","region":"in","role":"user","createdAt":"2026-11-09T09:56:01.148556001Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d6ad22a1-5154-4861-8086-5ad5825c4a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ad22a1-5154-4861-8086-5ad5825c4a8b
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3051c4e2f5","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6ad22a1-5154-4861-8086-5ad5825c4a8b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_511bd98d-d6b0-458c-abd6-75551ca3a57a"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-391c7961-88cf-4b88-85db-0ee1dc28f96e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-391c7961-88cf-4b88-85db-0ee1dc28f96e
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-391c7961-88cf-4b88-85db-0ee1dc28f96e
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

{"balance":5,"currency":"credits","accountId":"acc_511bd98d-d6b0-458c-abd6-75551ca3a57a"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-06ce6500-6aa0-49d1-a737-80816c56864a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-51aa1ad595ae4a5390c45a7318e388dd
X-Correlation-Id: qa-06ce6500-6aa0-49d1-a737-80816c56864a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-06ce6500-6aa0-49d1-a737-80816c56864a
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
Location: /v1/credits/purchases/pur_6c542e8b-4256-42a8-bd75-fc3439181d53
Content-Length: 144

{"id":"pur_6c542e8b-4256-42a8-bd75-fc3439181d53","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:56:01.545184901Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-75959a4d-d7a4-4f18-ace3-48a2c212ae9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75959a4d-d7a4-4f18-ace3-48a2c212ae9f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-75959a4d-d7a4-4f18-ace3-48a2c212ae9f
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

{"items":[{"id":"led_4983233c-83aa-4ecb-a96b-6b30be4bddab","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:56:01.148571704Z"},{"id":"led_eafdeb71-40fa-45fa-9538-15701f177a76","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6c542e8b-4256-42a8-bd75-fc3439181d53","createdAt":"2026-11-09T09:56:01.545184901Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c8689375-6b49-4557-be73-c82106d03507

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8689375-6b49-4557-be73-c82106d03507
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c8689375-6b49-4557-be73-c82106d03507
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
correlation: qa-8b5fce1c-aa21-4acf-bb6f-cf20c22e466b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b5fce1c-aa21-4acf-bb6f-cf20c22e466b
Content-Type: application/json

--- request body ---
{"handle":"qa-ce3051c4e2f5","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b5fce1c-aa21-4acf-bb6f-cf20c22e466b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8b5fce1c-aa21-4acf-bb6f-cf20c22e466b"}
```
