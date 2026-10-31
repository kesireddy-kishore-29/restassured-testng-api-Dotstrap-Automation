# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-2c3b2b98-0d48-47c4-be63-2b9285fd3c65` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-db3e1601-4243-4630-bc11-46ecc8687d83` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-d0138556-e4e1-45a9-a1bc-72af13c036ec` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-dc58abf7-7fa3-4912-ba69-dfffb496314c` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 9 | `qa-bcb7cebf-60ec-4ca5-8a39-2dd0e5a3b636` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-eced4a3e-de6e-4722-88ef-5dd706756cdc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9b0063c6-24e6-47cb-af19-773939382443` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-0d0bc931-f554-44f1-b727-3ce0869b4959` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ea240ba5-dc1a-42e0-865c-4ab6bffebb4a` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-c4bfa4f6-2d95-4dbc-9dcb-57ea899e8317` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c3b2b98-0d48-47c4-be63-2b9285fd3c65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c3b2b98-0d48-47c4-be63-2b9285fd3c65
Content-Type: application/json

--- request body ---
{"handle":"qa-1aef9d6920ed","displayName":"QA 1aef9d6920ed","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c3b2b98-0d48-47c4-be63-2b9285fd3c65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 8
Location: /v1/accounts/qa-1aef9d6920ed
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6255013d-e2bd-482d-aa06-b3e417ef8671","handle":"qa-1aef9d6920ed","displayName":"QA 1aef9d6920ed","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.037725776Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-db3e1601-4243-4630-bc11-46ecc8687d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3e1601-4243-4630-bc11-46ecc8687d83
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f82d35a535","displayName":"QA a9f82d35a535","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-db3e1601-4243-4630-bc11-46ecc8687d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Location: /v1/accounts/qa-a9f82d35a535
X-Served-Region: eu
Content-Length: 181

{"id":"acc_60e1137a-bc7d-4487-b3bb-f77a23def12c","handle":"qa-a9f82d35a535","displayName":"QA a9f82d35a535","region":"eu","role":"user","createdAt":"2026-10-26T07:54:48.079479490Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d0138556-e4e1-45a9-a1bc-72af13c036ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0138556-e4e1-45a9-a1bc-72af13c036ec
Content-Type: application/json

--- request body ---
{"handle":"qa-1aef9d6920ed","password":"****"}

--- response: 200 in 46 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0138556-e4e1-45a9-a1bc-72af13c036ec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6255013d-e2bd-482d-aa06-b3e417ef8671"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-dc58abf7-7fa3-4912-ba69-dfffb496314c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc58abf7-7fa3-4912-ba69-dfffb496314c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a9f82d35a535","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc58abf7-7fa3-4912-ba69-dfffb496314c
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
Location: /v1/conversations/cnv_641e3ecf-8fc3-4fd5-84f4-468333fed019
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_641e3ecf-8fc3-4fd5-84f4-468333fed019","subject":"Error contract","status":"open","region":"eu","participants":["qa-1aef9d6920ed","qa-a9f82d35a535"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.159880157Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_641e3ecf-8fc3-4fd5-84f4-468333fed019/messages
correlation: qa-bcb7cebf-60ec-4ca5-8a39-2dd0e5a3b636

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 3cb8c62f-5f61-41e9-ac7a-4f9394927f37
X-Correlation-Id: qa-bcb7cebf-60ec-4ca5-8a39-2dd0e5a3b636
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcb7cebf-60ec-4ca5-8a39-2dd0e5a3b636
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_641e3ecf-8fc3-4fd5-84f4-468333fed019/messages","correlationId":"qa-bcb7cebf-60ec-4ca5-8a39-2dd0e5a3b636"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-eced4a3e-de6e-4722-88ef-5dd706756cdc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eced4a3e-de6e-4722-88ef-5dd706756cdc
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f82d35a535","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-eced4a3e-de6e-4722-88ef-5dd706756cdc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_60e1137a-bc7d-4487-b3bb-f77a23def12c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9b0063c6-24e6-47cb-af19-773939382443

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b0063c6-24e6-47cb-af19-773939382443
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9b0063c6-24e6-47cb-af19-773939382443
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
correlation: qa-0d0bc931-f554-44f1-b727-3ce0869b4959

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d0bc931-f554-44f1-b727-3ce0869b4959
Content-Type: application/json

--- request body ---
{"handle":"qa-a9f82d35a535","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d0bc931-f554-44f1-b727-3ce0869b4959
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d0bc931-f554-44f1-b727-3ce0869b4959"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea240ba5-dc1a-42e0-865c-4ab6bffebb4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea240ba5-dc1a-42e0-865c-4ab6bffebb4a
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea240ba5-dc1a-42e0-865c-4ab6bffebb4a
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
correlation: qa-c4bfa4f6-2d95-4dbc-9dcb-57ea899e8317

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4bfa4f6-2d95-4dbc-9dcb-57ea899e8317
Content-Type: application/json

--- request body ---
{"handle":"qa-1aef9d6920ed","password":"****"}

--- response: 401 in 28 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4bfa4f6-2d95-4dbc-9dcb-57ea899e8317
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4bfa4f6-2d95-4dbc-9dcb-57ea899e8317"}
```
