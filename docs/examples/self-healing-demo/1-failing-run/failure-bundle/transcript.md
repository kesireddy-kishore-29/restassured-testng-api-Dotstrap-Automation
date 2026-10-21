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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-5e93b67b-9dc9-4c03-ba58-676be7c0143c` |
| 2 | `POST /v1/auth/token` | 200 | 15 | `qa-960ad883-3084-49f2-b71b-6e40896efbee` |
| 3 | `GET /v1/credits/balance` | 200 | 10 | `qa-bd225491-9e4f-4a41-82db-afb3ec2802fc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-561b540a-6686-4d98-9501-5a35a9cbd6a6` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-d92c5cdb-6c64-41e9-a348-97e1b62f3152` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5e93b67b-9dc9-4c03-ba58-676be7c0143c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e93b67b-9dc9-4c03-ba58-676be7c0143c
Content-Type: application/json

--- request body ---
{"handle":"qa-0da74971a8b2","displayName":"QA 0da74971a8b2","password":"****","region":"in"}

--- response: 201 in 17 ms ---
Date: Wed, 21 Oct 2026 14:51:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e93b67b-9dc9-4c03-ba58-676be7c0143c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-0da74971a8b2
X-Served-Region: in
Content-Length: 181

{"id":"acc_7945f868-cd38-474d-89f7-edc45209225b","handle":"qa-0da74971a8b2","displayName":"QA 0da74971a8b2","region":"in","role":"user","createdAt":"2026-10-21T14:51:09.769563200Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-960ad883-3084-49f2-b71b-6e40896efbee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960ad883-3084-49f2-b71b-6e40896efbee
Content-Type: application/json

--- request body ---
{"handle":"qa-0da74971a8b2","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 21 Oct 2026 14:51:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-960ad883-3084-49f2-b71b-6e40896efbee
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7945f868-cd38-474d-89f7-edc45209225b"}
```

## 3. GET /v1/credits/balance

```text
#3 GET http://localhost:7070/v1/credits/balance
correlation: qa-bd225491-9e4f-4a41-82db-afb3ec2802fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd225491-9e4f-4a41-82db-afb3ec2802fc
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 21 Oct 2026 14:51:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd225491-9e4f-4a41-82db-afb3ec2802fc
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

{"availableBalance":5,"currency":"credits","accountId":"acc_7945f868-cd38-474d-89f7-edc45209225b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-561b540a-6686-4d98-9501-5a35a9cbd6a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561b540a-6686-4d98-9501-5a35a9cbd6a6
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 21 Oct 2026 14:51:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-561b540a-6686-4d98-9501-5a35a9cbd6a6
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
correlation: qa-d92c5cdb-6c64-41e9-a348-97e1b62f3152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d92c5cdb-6c64-41e9-a348-97e1b62f3152
Content-Type: application/json

--- request body ---
{"handle":"qa-0da74971a8b2","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 21 Oct 2026 14:51:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d92c5cdb-6c64-41e9-a348-97e1b62f3152
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d92c5cdb-6c64-41e9-a348-97e1b62f3152"}
```
