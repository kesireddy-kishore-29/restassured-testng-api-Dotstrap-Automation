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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-5c530552-477e-4c66-84fb-7c16d760841e` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-f5fc1063-c555-4399-9e79-d0f4159a681e` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-91a6b0a7-4df4-444e-9851-26cfa3b01df4` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-2325af55-ca08-471d-b5fa-8107ec118398` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 13 | `qa-e53b96ae-f752-42da-a84f-14e36a632cbd` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-cac6b5f2-7dc0-4a50-bb8d-681ba002c8bb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-7a0eeebc-f9b0-439e-b876-e40f60aee845` |
| 8 | `POST /v1/auth/token` | 401 | 23 | `qa-14275ded-02c1-49e8-82a6-c49ea131938c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-53af0def-7894-4bc2-8298-ab9589f87a91` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-ebccda64-20d5-42b0-800f-f4429721fab0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5c530552-477e-4c66-84fb-7c16d760841e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c530552-477e-4c66-84fb-7c16d760841e
Content-Type: application/json

--- request body ---
{"handle":"qa-06bb366bb89d","displayName":"QA 06bb366bb89d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c530552-477e-4c66-84fb-7c16d760841e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 7
Location: /v1/accounts/qa-06bb366bb89d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b879e1c5-a051-4679-a7fe-354960dc434c","handle":"qa-06bb366bb89d","displayName":"QA 06bb366bb89d","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.871284390Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f5fc1063-c555-4399-9e79-d0f4159a681e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5fc1063-c555-4399-9e79-d0f4159a681e
Content-Type: application/json

--- request body ---
{"handle":"qa-a8f78ccfb956","displayName":"QA a8f78ccfb956","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5fc1063-c555-4399-9e79-d0f4159a681e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 7
Location: /v1/accounts/qa-a8f78ccfb956
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d011605c-2e3d-4b9a-976b-6ae5ea3daf89","handle":"qa-a8f78ccfb956","displayName":"QA a8f78ccfb956","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.917223667Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-91a6b0a7-4df4-444e-9851-26cfa3b01df4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91a6b0a7-4df4-444e-9851-26cfa3b01df4
Content-Type: application/json

--- request body ---
{"handle":"qa-06bb366bb89d","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-91a6b0a7-4df4-444e-9851-26cfa3b01df4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b879e1c5-a051-4679-a7fe-354960dc434c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2325af55-ca08-471d-b5fa-8107ec118398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2325af55-ca08-471d-b5fa-8107ec118398
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a8f78ccfb956","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2325af55-ca08-471d-b5fa-8107ec118398
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
Location: /v1/conversations/cnv_a9515e62-6236-40b9-a5ed-cbfeff3e006a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a9515e62-6236-40b9-a5ed-cbfeff3e006a","subject":"Error contract","status":"open","region":"eu","participants":["qa-06bb366bb89d","qa-a8f78ccfb956"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.043000307Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a9515e62-6236-40b9-a5ed-cbfeff3e006a/read
correlation: qa-e53b96ae-f752-42da-a84f-14e36a632cbd

--- request headers ---
Accept: application/json
X-Fault-Key: 0f510053-e916-419c-afc1-cf24d5eaf53c
X-Fault: unavailable-once
X-Correlation-Id: qa-e53b96ae-f752-42da-a84f-14e36a632cbd
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e53b96ae-f752-42da-a84f-14e36a632cbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_a9515e62-6236-40b9-a5ed-cbfeff3e006a/read","correlationId":"qa-e53b96ae-f752-42da-a84f-14e36a632cbd"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cac6b5f2-7dc0-4a50-bb8d-681ba002c8bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac6b5f2-7dc0-4a50-bb8d-681ba002c8bb
Content-Type: application/json

--- request body ---
{"handle":"qa-a8f78ccfb956","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac6b5f2-7dc0-4a50-bb8d-681ba002c8bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d011605c-2e3d-4b9a-976b-6ae5ea3daf89"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a0eeebc-f9b0-439e-b876-e40f60aee845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a0eeebc-f9b0-439e-b876-e40f60aee845
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a0eeebc-f9b0-439e-b876-e40f60aee845
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
correlation: qa-14275ded-02c1-49e8-82a6-c49ea131938c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14275ded-02c1-49e8-82a6-c49ea131938c
Content-Type: application/json

--- request body ---
{"handle":"qa-a8f78ccfb956","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-14275ded-02c1-49e8-82a6-c49ea131938c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-14275ded-02c1-49e8-82a6-c49ea131938c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-53af0def-7894-4bc2-8298-ab9589f87a91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53af0def-7894-4bc2-8298-ab9589f87a91
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-53af0def-7894-4bc2-8298-ab9589f87a91
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
correlation: qa-ebccda64-20d5-42b0-800f-f4429721fab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebccda64-20d5-42b0-800f-f4429721fab0
Content-Type: application/json

--- request body ---
{"handle":"qa-06bb366bb89d","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ebccda64-20d5-42b0-800f-f4429721fab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ebccda64-20d5-42b0-800f-f4429721fab0"}
```
