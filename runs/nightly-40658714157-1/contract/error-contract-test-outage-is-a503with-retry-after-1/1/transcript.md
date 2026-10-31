# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-a0184a7a-ff53-4571-b200-45a455ec0372` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-7af9c925-64c0-4b68-9184-4432ce612b7e` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-f128d806-876a-45eb-b4c5-d5aa7793a24a` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-b515057d-e891-4575-8c93-0c9eeb9ba672` |
| 5 | `POST /v1/accounts` | 503 | 13 | `qa-062082fc-b951-4e2c-afcf-1c3a01773ab5` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-ac3115be-fe90-4bf3-a723-062eaad40f15` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-824d3f64-c478-4375-a449-b712e6091ee2` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-d55e333f-4053-43cb-b084-61e203923763` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-26b5ad0d-9f76-4168-a4cf-b02be39c6a70` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-a1243e62-d2b9-4c7a-b98a-0b5db53b1473` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a0184a7a-ff53-4571-b200-45a455ec0372

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0184a7a-ff53-4571-b200-45a455ec0372
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e9617b9a59","displayName":"QA d1e9617b9a59","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0184a7a-ff53-4571-b200-45a455ec0372
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 10
Location: /v1/accounts/qa-d1e9617b9a59
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df063648-aee2-4cfa-a1ff-eb6b9c34f380","handle":"qa-d1e9617b9a59","displayName":"QA d1e9617b9a59","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.362323690Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7af9c925-64c0-4b68-9184-4432ce612b7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7af9c925-64c0-4b68-9184-4432ce612b7e
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f2a320b065","displayName":"QA e6f2a320b065","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-7af9c925-64c0-4b68-9184-4432ce612b7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Location: /v1/accounts/qa-e6f2a320b065
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6aea65fb-9437-4683-9438-959504971f71","handle":"qa-e6f2a320b065","displayName":"QA e6f2a320b065","region":"eu","role":"user","createdAt":"2026-10-28T08:42:51.398019995Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f128d806-876a-45eb-b4c5-d5aa7793a24a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f128d806-876a-45eb-b4c5-d5aa7793a24a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e9617b9a59","password":"****"}

--- response: 200 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-f128d806-876a-45eb-b4c5-d5aa7793a24a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df063648-aee2-4cfa-a1ff-eb6b9c34f380"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b515057d-e891-4575-8c93-0c9eeb9ba672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b515057d-e891-4575-8c93-0c9eeb9ba672
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e6f2a320b065","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b515057d-e891-4575-8c93-0c9eeb9ba672
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
Location: /v1/conversations/cnv_4e9859f1-e4a7-4152-a786-a6df2248e713
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4e9859f1-e4a7-4152-a786-a6df2248e713","subject":"Error contract","status":"open","region":"eu","participants":["qa-d1e9617b9a59","qa-e6f2a320b065"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:51.481380566Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-062082fc-b951-4e2c-afcf-1c3a01773ab5

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9b8836bd-9457-4036-ae85-b4a0bf271d5d
X-Correlation-Id: qa-062082fc-b951-4e2c-afcf-1c3a01773ab5
Content-Type: application/json

--- request body ---
{"handle":"qa-41156673e93a","displayName":"QA 41156673e93a","password":"****","region":"eu"}

--- response: 503 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-062082fc-b951-4e2c-afcf-1c3a01773ab5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-062082fc-b951-4e2c-afcf-1c3a01773ab5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ac3115be-fe90-4bf3-a723-062eaad40f15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac3115be-fe90-4bf3-a723-062eaad40f15
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f2a320b065","password":"****"}

--- response: 200 in 41 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac3115be-fe90-4bf3-a723-062eaad40f15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6aea65fb-9437-4683-9438-959504971f71"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-824d3f64-c478-4375-a449-b712e6091ee2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-824d3f64-c478-4375-a449-b712e6091ee2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-824d3f64-c478-4375-a449-b712e6091ee2
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
correlation: qa-d55e333f-4053-43cb-b084-61e203923763

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d55e333f-4053-43cb-b084-61e203923763
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f2a320b065","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d55e333f-4053-43cb-b084-61e203923763
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d55e333f-4053-43cb-b084-61e203923763"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-26b5ad0d-9f76-4168-a4cf-b02be39c6a70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26b5ad0d-9f76-4168-a4cf-b02be39c6a70
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-26b5ad0d-9f76-4168-a4cf-b02be39c6a70
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
correlation: qa-a1243e62-d2b9-4c7a-b98a-0b5db53b1473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1243e62-d2b9-4c7a-b98a-0b5db53b1473
Content-Type: application/json

--- request body ---
{"handle":"qa-d1e9617b9a59","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1243e62-d2b9-4c7a-b98a-0b5db53b1473
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1243e62-d2b9-4c7a-b98a-0b5db53b1473"}
```
