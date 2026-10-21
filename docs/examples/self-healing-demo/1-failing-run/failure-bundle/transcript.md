# Transcript: Balance, ledger and purchase match their schemas

| | |
|---|---|
| Test | `com.kishore.qa.tests.contract.ContractTest#creditResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 3 |
| Status | failed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-c13ba646-1b89-4947-8a91-ba5091ee8f19` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-6018afc6-8879-41b4-be29-861ccec11dd3` |
| 3 | `GET /v1/credits/balance` | 200 | 8 | `qa-aae7afa4-af76-4e2f-8a37-7d8b840ca71d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-a7e5fabe-adb2-4906-a727-ea1920a02add` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-f722b404-49cd-4235-b049-bd8f2aa55047` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c13ba646-1b89-4947-8a91-ba5091ee8f19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c13ba646-1b89-4947-8a91-ba5091ee8f19
Content-Type: application/json

--- request body ---
{"handle":"qa-62bb4a632622","displayName":"QA 62bb4a632622","password":"****","region":"in"}

--- response: 201 in 14 ms ---
Date: Wed, 21 Oct 2026 06:08:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-c13ba646-1b89-4947-8a91-ba5091ee8f19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-62bb4a632622
X-Served-Region: in
Content-Length: 181

{"id":"acc_7d879700-d641-4825-9587-0dbd8d699c25","handle":"qa-62bb4a632622","displayName":"QA 62bb4a632622","region":"in","role":"user","createdAt":"2026-10-21T06:08:02.076060600Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6018afc6-8879-41b4-be29-861ccec11dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6018afc6-8879-41b4-be29-861ccec11dd3
Content-Type: application/json

--- request body ---
{"handle":"qa-62bb4a632622","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 21 Oct 2026 06:08:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6018afc6-8879-41b4-be29-861ccec11dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d879700-d641-4825-9587-0dbd8d699c25"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-aae7afa4-af76-4e2f-8a37-7d8b840ca71d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aae7afa4-af76-4e2f-8a37-7d8b840ca71d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 21 Oct 2026 06:08:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-aae7afa4-af76-4e2f-8a37-7d8b840ca71d
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

{"availableBalance":5,"currency":"credits","accountId":"acc_7d879700-d641-4825-9587-0dbd8d699c25"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7e5fabe-adb2-4906-a727-ea1920a02add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7e5fabe-adb2-4906-a727-ea1920a02add
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 21 Oct 2026 06:08:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7e5fabe-adb2-4906-a727-ea1920a02add
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
correlation: qa-f722b404-49cd-4235-b049-bd8f2aa55047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f722b404-49cd-4235-b049-bd8f2aa55047
Content-Type: application/json

--- request body ---
{"handle":"qa-62bb4a632622","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 21 Oct 2026 06:08:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f722b404-49cd-4235-b049-bd8f2aa55047
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f722b404-49cd-4235-b049-bd8f2aa55047"}
```
