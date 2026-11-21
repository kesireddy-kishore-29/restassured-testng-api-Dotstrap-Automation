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
| 1 | `POST /v1/accounts` | 201 | 328 | `qa-082257eb-8ac0-4736-9af3-49472612a598` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-259d2a79-609b-4024-b355-be00c9865f10` |
| 3 | `GET /v1/credits/balance` | 200 | 34 | `qa-c8052983-7001-4520-ba72-f0f5c871c77e` |
| 4 | `POST /v1/credits/purchases` | 201 | 25 | `qa-87594bbe-7bfe-408d-a337-cc6433ecb4c5` |
| 5 | `GET /v1/credits/ledger` | 200 | 23 | `qa-79f7ff5e-f138-47c3-94bb-19875608dd61` |
| 6 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-721734d2-b09b-4d51-8479-12ecda3c823a` |
| 7 | `POST /v1/auth/token` | 401 | 7 | `qa-ef23b649-83d5-4191-988e-3f0dab623f8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-082257eb-8ac0-4736-9af3-49472612a598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-082257eb-8ac0-4736-9af3-49472612a598
Content-Type: application/json

--- request body ---
{"handle":"qa-ec618d6bd930","displayName":"QA ec618d6bd930","password":"****","region":"in"}

--- response: 201 in 328 ms ---
Date: Tue, 17 Nov 2026 10:50:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-082257eb-8ac0-4736-9af3-49472612a598
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
Location: /v1/accounts/qa-ec618d6bd930
X-Served-Region: in
Content-Length: 181

{"id":"acc_e02e6202-5ab7-478a-937a-72319487ba97","handle":"qa-ec618d6bd930","displayName":"QA ec618d6bd930","region":"in","role":"user","createdAt":"2026-11-17T10:50:16.799652567Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-259d2a79-609b-4024-b355-be00c9865f10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-259d2a79-609b-4024-b355-be00c9865f10
Content-Type: application/json

--- request body ---
{"handle":"qa-ec618d6bd930","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-259d2a79-609b-4024-b355-be00c9865f10
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e02e6202-5ab7-478a-937a-72319487ba97"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-c8052983-7001-4520-ba72-f0f5c871c77e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8052983-7001-4520-ba72-f0f5c871c77e
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8052983-7001-4520-ba72-f0f5c871c77e
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

{"balance":5,"currency":"credits","accountId":"acc_e02e6202-5ab7-478a-937a-72319487ba97"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-87594bbe-7bfe-408d-a337-cc6433ecb4c5

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ff034022879d4457b90b4421301378aa
X-Correlation-Id: qa-87594bbe-7bfe-408d-a337-cc6433ecb4c5
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-87594bbe-7bfe-408d-a337-cc6433ecb4c5
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
Location: /v1/credits/purchases/pur_6e70baab-053c-4ff8-bb90-be79b61420c7
Content-Length: 144

{"id":"pur_6e70baab-053c-4ff8-bb90-be79b61420c7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-17T10:50:17.270179758Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-79f7ff5e-f138-47c3-94bb-19875608dd61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79f7ff5e-f138-47c3-94bb-19875608dd61
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-79f7ff5e-f138-47c3-94bb-19875608dd61
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

{"items":[{"id":"led_4e8e458d-b021-468d-a429-7165d4a9185f","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-17T10:50:16.799675075Z"},{"id":"led_e6790625-d287-4b6f-9990-2e40f678a54a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_6e70baab-053c-4ff8-bb90-be79b61420c7","createdAt":"2026-11-17T10:50:17.270179758Z"}],"total":2,"balance":15}
```

## 6. DELETE /v1/accounts/me

```text
#6 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-721734d2-b09b-4d51-8479-12ecda3c823a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-721734d2-b09b-4d51-8479-12ecda3c823a
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-721734d2-b09b-4d51-8479-12ecda3c823a
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
correlation: qa-ef23b649-83d5-4191-988e-3f0dab623f8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef23b649-83d5-4191-988e-3f0dab623f8e
Content-Type: application/json

--- request body ---
{"handle":"qa-ec618d6bd930","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef23b649-83d5-4191-988e-3f0dab623f8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ef23b649-83d5-4191-988e-3f0dab623f8e"}
```
