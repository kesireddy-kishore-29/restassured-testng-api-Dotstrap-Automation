# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-c7a3aa4f-598b-44ee-bdb7-7c5be95f05d8` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-ada4d3f4-0cd4-47e9-a62b-86a8b559cd59` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-1d1ccfff-8e4b-4dcc-b0a8-7ed2ea7aa2ba` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-86ba88cc-6808-41af-a307-673448ce4e57` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 20 | `qa-2100d2ce-5086-45de-9061-b78e27ec09b9` |
| 6 | `POST /v1/auth/token` | 200 | 15 | `qa-2e022de1-331b-4adf-b01f-aaf12d3bcffc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ae13c170-3402-4755-ae46-114254d753bd` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-9d0087ed-7124-48b2-add8-fcebfe408f09` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6735426b-9a40-4ef9-b1d1-ddf96398a957` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-f595ec30-2a48-4eff-aab7-98b83de3258c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c7a3aa4f-598b-44ee-bdb7-7c5be95f05d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a3aa4f-598b-44ee-bdb7-7c5be95f05d8
Content-Type: application/json

--- request body ---
{"handle":"qa-6949a2243805","displayName":"QA 6949a2243805","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7a3aa4f-598b-44ee-bdb7-7c5be95f05d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-6949a2243805
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc0d704b-3009-41be-802b-4c38f14fd90d","handle":"qa-6949a2243805","displayName":"QA 6949a2243805","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.830528318Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ada4d3f4-0cd4-47e9-a62b-86a8b559cd59

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ada4d3f4-0cd4-47e9-a62b-86a8b559cd59
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9aa360441a","displayName":"QA 6f9aa360441a","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ada4d3f4-0cd4-47e9-a62b-86a8b559cd59
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f9aa360441a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39547e58-33e4-49e6-814c-0cb7e13a1014","handle":"qa-6f9aa360441a","displayName":"QA 6f9aa360441a","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.867630515Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1d1ccfff-8e4b-4dcc-b0a8-7ed2ea7aa2ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d1ccfff-8e4b-4dcc-b0a8-7ed2ea7aa2ba
Content-Type: application/json

--- request body ---
{"handle":"qa-6949a2243805","password":"****"}

--- response: 200 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d1ccfff-8e4b-4dcc-b0a8-7ed2ea7aa2ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc0d704b-3009-41be-802b-4c38f14fd90d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-86ba88cc-6808-41af-a307-673448ce4e57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ba88cc-6808-41af-a307-673448ce4e57
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6f9aa360441a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ba88cc-6808-41af-a307-673448ce4e57
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
Location: /v1/conversations/cnv_13e0e4fa-ecb7-4951-8bdc-eaa96dcd5f88
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_13e0e4fa-ecb7-4951-8bdc-eaa96dcd5f88","subject":"Error contract","status":"open","region":"eu","participants":["qa-6949a2243805","qa-6f9aa360441a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.931053172Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_13e0e4fa-ecb7-4951-8bdc-eaa96dcd5f88/read
correlation: qa-2100d2ce-5086-45de-9061-b78e27ec09b9

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3adc50d3-800a-44c9-b3c9-7ddbd96c1e61
X-Correlation-Id: qa-2100d2ce-5086-45de-9061-b78e27ec09b9
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2100d2ce-5086-45de-9061-b78e27ec09b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_13e0e4fa-ecb7-4951-8bdc-eaa96dcd5f88/read","correlationId":"qa-2100d2ce-5086-45de-9061-b78e27ec09b9"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2e022de1-331b-4adf-b01f-aaf12d3bcffc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e022de1-331b-4adf-b01f-aaf12d3bcffc
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9aa360441a","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e022de1-331b-4adf-b01f-aaf12d3bcffc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39547e58-33e4-49e6-814c-0cb7e13a1014"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae13c170-3402-4755-ae46-114254d753bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae13c170-3402-4755-ae46-114254d753bd
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae13c170-3402-4755-ae46-114254d753bd
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
correlation: qa-9d0087ed-7124-48b2-add8-fcebfe408f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d0087ed-7124-48b2-add8-fcebfe408f09
Content-Type: application/json

--- request body ---
{"handle":"qa-6f9aa360441a","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d0087ed-7124-48b2-add8-fcebfe408f09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d0087ed-7124-48b2-add8-fcebfe408f09"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6735426b-9a40-4ef9-b1d1-ddf96398a957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6735426b-9a40-4ef9-b1d1-ddf96398a957
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6735426b-9a40-4ef9-b1d1-ddf96398a957
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
correlation: qa-f595ec30-2a48-4eff-aab7-98b83de3258c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f595ec30-2a48-4eff-aab7-98b83de3258c
Content-Type: application/json

--- request body ---
{"handle":"qa-6949a2243805","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f595ec30-2a48-4eff-aab7-98b83de3258c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f595ec30-2a48-4eff-aab7-98b83de3258c"}
```
