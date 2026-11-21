# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-d165f92d-6a95-4cc7-aaf0-44e42db789df` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-a1084214-c928-4d6b-8455-9b9c76d3949a` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-061d3815-c8c3-4013-b0b3-4eb05f8371f6` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-2fdd3c4d-60ee-4b21-bab9-e27c4301d882` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 11 | `qa-7c7eeada-2bc0-4d41-90ae-97a0da2482a1` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-110d9ca4-7ec0-4fbd-bbac-daf0d043fe85` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-85a3bbdf-4e73-42a5-9863-339a1d12195a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-74099b5a-5456-4491-a9da-3db69be72a08` |
| 9 | `DELETE /v1/accounts/me` | 204 | 57 | `qa-cf564aab-cfaa-482d-b52c-6877fc4e59f4` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-c4ccc50d-f2ee-4c1c-b31b-488352137047` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d165f92d-6a95-4cc7-aaf0-44e42db789df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d165f92d-6a95-4cc7-aaf0-44e42db789df
Content-Type: application/json

--- request body ---
{"handle":"qa-ea09b91f59db","displayName":"QA ea09b91f59db","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d165f92d-6a95-4cc7-aaf0-44e42db789df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Location: /v1/accounts/qa-ea09b91f59db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_69a28e96-a7c9-44b9-aac7-fd0d25f197ec","handle":"qa-ea09b91f59db","displayName":"QA ea09b91f59db","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.230380344Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a1084214-c928-4d6b-8455-9b9c76d3949a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1084214-c928-4d6b-8455-9b9c76d3949a
Content-Type: application/json

--- request body ---
{"handle":"qa-631b82d759c1","displayName":"QA 631b82d759c1","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1084214-c928-4d6b-8455-9b9c76d3949a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-631b82d759c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2e29cc02-f38d-47d4-bf8c-4de1e415439a","handle":"qa-631b82d759c1","displayName":"QA 631b82d759c1","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.281473292Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-061d3815-c8c3-4013-b0b3-4eb05f8371f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-061d3815-c8c3-4013-b0b3-4eb05f8371f6
Content-Type: application/json

--- request body ---
{"handle":"qa-ea09b91f59db","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-061d3815-c8c3-4013-b0b3-4eb05f8371f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 367
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_69a28e96-a7c9-44b9-aac7-fd0d25f197ec"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2fdd3c4d-60ee-4b21-bab9-e27c4301d882

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fdd3c4d-60ee-4b21-bab9-e27c4301d882
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-631b82d759c1","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fdd3c4d-60ee-4b21-bab9-e27c4301d882
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
Location: /v1/conversations/cnv_60de2f0c-eb0f-440a-a336-5c544a02dc01
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_60de2f0c-eb0f-440a-a336-5c544a02dc01","subject":"Error contract","status":"open","region":"eu","participants":["qa-ea09b91f59db","qa-631b82d759c1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.347335082Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_60de2f0c-eb0f-440a-a336-5c544a02dc01/messages
correlation: qa-7c7eeada-2bc0-4d41-90ae-97a0da2482a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c7eeada-2bc0-4d41-90ae-97a0da2482a1
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c7eeada-2bc0-4d41-90ae-97a0da2482a1
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_60de2f0c-eb0f-440a-a336-5c544a02dc01/messages","correlationId":"qa-7c7eeada-2bc0-4d41-90ae-97a0da2482a1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-110d9ca4-7ec0-4fbd-bbac-daf0d043fe85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-110d9ca4-7ec0-4fbd-bbac-daf0d043fe85
Content-Type: application/json

--- request body ---
{"handle":"qa-631b82d759c1","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-110d9ca4-7ec0-4fbd-bbac-daf0d043fe85
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 347
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2e29cc02-f38d-47d4-bf8c-4de1e415439a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85a3bbdf-4e73-42a5-9863-339a1d12195a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85a3bbdf-4e73-42a5-9863-339a1d12195a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85a3bbdf-4e73-42a5-9863-339a1d12195a
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
correlation: qa-74099b5a-5456-4491-a9da-3db69be72a08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74099b5a-5456-4491-a9da-3db69be72a08
Content-Type: application/json

--- request body ---
{"handle":"qa-631b82d759c1","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74099b5a-5456-4491-a9da-3db69be72a08
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74099b5a-5456-4491-a9da-3db69be72a08"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf564aab-cfaa-482d-b52c-6877fc4e59f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf564aab-cfaa-482d-b52c-6877fc4e59f4
Content-Type: application/json

--- response: 204 in 57 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf564aab-cfaa-482d-b52c-6877fc4e59f4
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
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c4ccc50d-f2ee-4c1c-b31b-488352137047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ccc50d-f2ee-4c1c-b31b-488352137047
Content-Type: application/json

--- request body ---
{"handle":"qa-ea09b91f59db","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4ccc50d-f2ee-4c1c-b31b-488352137047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c4ccc50d-f2ee-4c1c-b31b-488352137047"}
```
