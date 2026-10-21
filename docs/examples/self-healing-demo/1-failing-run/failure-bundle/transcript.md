# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 3 |
| Status | failed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 15 | `qa-11140af8-36ef-464f-bb5e-8e56f976257b` |
| 2 | `POST /v1/auth/token` | 200 | 13 | `qa-9553b827-edd3-4e05-a41a-a8c97ce6614a` |
| 3 | `GET /v1/credits/balance` | 200 | 12 | `qa-06ce5df3-060b-42fd-843f-4e2a36dd0933` |
| 4 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-03886d78-3e2b-4aa0-899e-c2dc099b1313` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-9312a252-8bd4-4652-bd97-8bdedf9f260e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-11140af8-36ef-464f-bb5e-8e56f976257b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11140af8-36ef-464f-bb5e-8e56f976257b
Content-Type: application/json

--- request body ---
{"handle":"qa-71943b9c19e4","displayName":"QA 71943b9c19e4","password":"****","region":"in"}

--- response: 201 in 15 ms ---
Date: Wed, 21 Oct 2026 16:07:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-11140af8-36ef-464f-bb5e-8e56f976257b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Location: /v1/accounts/qa-71943b9c19e4
X-Served-Region: in
Content-Length: 181

{"id":"acc_55d5a794-679a-4212-8174-cafaf5ae544e","handle":"qa-71943b9c19e4","displayName":"QA 71943b9c19e4","region":"in","role":"user","createdAt":"2026-10-21T16:07:30.995141400Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9553b827-edd3-4e05-a41a-a8c97ce6614a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9553b827-edd3-4e05-a41a-a8c97ce6614a
Content-Type: application/json

--- request body ---
{"handle":"qa-71943b9c19e4","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 21 Oct 2026 16:07:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9553b827-edd3-4e05-a41a-a8c97ce6614a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55d5a794-679a-4212-8174-cafaf5ae544e"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-06ce5df3-060b-42fd-843f-4e2a36dd0933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06ce5df3-060b-42fd-843f-4e2a36dd0933
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Wed, 21 Oct 2026 16:07:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-06ce5df3-060b-42fd-843f-4e2a36dd0933
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
Content-Length: 98

{"availableBalance":5,"currency":"credits","accountId":"acc_55d5a794-679a-4212-8174-cafaf5ae544e"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03886d78-3e2b-4aa0-899e-c2dc099b1313

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03886d78-3e2b-4aa0-899e-c2dc099b1313
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 21 Oct 2026 16:07:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03886d78-3e2b-4aa0-899e-c2dc099b1313
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
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9312a252-8bd4-4652-bd97-8bdedf9f260e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9312a252-8bd4-4652-bd97-8bdedf9f260e
Content-Type: application/json

--- request body ---
{"handle":"qa-71943b9c19e4","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 21 Oct 2026 16:07:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9312a252-8bd4-4652-bd97-8bdedf9f260e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9312a252-8bd4-4652-bd97-8bdedf9f260e"}
```
