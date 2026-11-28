# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-1576706d-2d89-474f-8812-2b742143d0bd` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-0567c601-986a-4608-8dfa-6365bbe6f639` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-c561f4b5-8934-42c3-b8f6-8c44ae4264e5` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-a018bfcc-3b30-42df-b35e-f6508519174d` |
| 5 | `PATCH /v1/accounts/me` | 503 | 5 | `qa-f01f6296-0d77-44fb-b88f-a5e39ce9d722` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-fc18da0a-f62c-4f9b-a023-3a521728f473` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-f4faaade-1844-4626-8cb3-13aac3770ca5` |
| 8 | `POST /v1/auth/token` | 401 | 27 | `qa-9aee2cd9-14a0-45a5-a49f-b32464478646` |
| 9 | `DELETE /v1/accounts/me` | 204 | 49 | `qa-6f66f46f-6750-4c58-b86f-e7207dd2acff` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-4d017e53-a495-4c99-aa1b-421cfbc638b4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1576706d-2d89-474f-8812-2b742143d0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1576706d-2d89-474f-8812-2b742143d0bd
Content-Type: application/json

--- request body ---
{"handle":"qa-fb702a3d2393","displayName":"QA fb702a3d2393","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-1576706d-2d89-474f-8812-2b742143d0bd
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
Location: /v1/accounts/qa-fb702a3d2393
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df11d838-1034-4e72-bbd1-864f392b6abe","handle":"qa-fb702a3d2393","displayName":"QA fb702a3d2393","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.641398976Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0567c601-986a-4608-8dfa-6365bbe6f639

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0567c601-986a-4608-8dfa-6365bbe6f639
Content-Type: application/json

--- request body ---
{"handle":"qa-a50cec4884bf","displayName":"QA a50cec4884bf","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0567c601-986a-4608-8dfa-6365bbe6f639
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
Location: /v1/accounts/qa-a50cec4884bf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2efe4ed2-0936-421a-95da-faeee6ffede9","handle":"qa-a50cec4884bf","displayName":"QA a50cec4884bf","region":"eu","role":"user","createdAt":"2026-11-23T10:54:57.681161414Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c561f4b5-8934-42c3-b8f6-8c44ae4264e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c561f4b5-8934-42c3-b8f6-8c44ae4264e5
Content-Type: application/json

--- request body ---
{"handle":"qa-fb702a3d2393","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-c561f4b5-8934-42c3-b8f6-8c44ae4264e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df11d838-1034-4e72-bbd1-864f392b6abe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a018bfcc-3b30-42df-b35e-f6508519174d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a018bfcc-3b30-42df-b35e-f6508519174d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a50cec4884bf","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a018bfcc-3b30-42df-b35e-f6508519174d
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
Location: /v1/conversations/cnv_c34c7a4c-c285-4f62-92e6-cc8279d29c70
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c34c7a4c-c285-4f62-92e6-cc8279d29c70","subject":"Error contract","status":"open","region":"eu","participants":["qa-fb702a3d2393","qa-a50cec4884bf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:54:57.778025618Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-f01f6296-0d77-44fb-b88f-a5e39ce9d722

--- request headers ---
Accept: application/json
X-Fault-Key: 652a98fe-3fee-47d7-9265-272d85859626
X-Fault: unavailable-once
X-Correlation-Id: qa-f01f6296-0d77-44fb-b88f-a5e39ce9d722
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f01f6296-0d77-44fb-b88f-a5e39ce9d722
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f01f6296-0d77-44fb-b88f-a5e39ce9d722"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc18da0a-f62c-4f9b-a023-3a521728f473

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc18da0a-f62c-4f9b-a023-3a521728f473
Content-Type: application/json

--- request body ---
{"handle":"qa-a50cec4884bf","password":"****"}

--- response: 200 in 49 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc18da0a-f62c-4f9b-a023-3a521728f473
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2efe4ed2-0936-421a-95da-faeee6ffede9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f4faaade-1844-4626-8cb3-13aac3770ca5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4faaade-1844-4626-8cb3-13aac3770ca5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f4faaade-1844-4626-8cb3-13aac3770ca5
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
correlation: qa-9aee2cd9-14a0-45a5-a49f-b32464478646

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aee2cd9-14a0-45a5-a49f-b32464478646
Content-Type: application/json

--- request body ---
{"handle":"qa-a50cec4884bf","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9aee2cd9-14a0-45a5-a49f-b32464478646
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9aee2cd9-14a0-45a5-a49f-b32464478646"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f66f46f-6750-4c58-b86f-e7207dd2acff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f66f46f-6750-4c58-b86f-e7207dd2acff
Content-Type: application/json

--- response: 204 in 49 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f66f46f-6750-4c58-b86f-e7207dd2acff
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
correlation: qa-4d017e53-a495-4c99-aa1b-421cfbc638b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d017e53-a495-4c99-aa1b-421cfbc638b4
Content-Type: application/json

--- request body ---
{"handle":"qa-fb702a3d2393","password":"****"}

--- response: 401 in 27 ms ---
Date: Mon, 23 Nov 2026 10:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d017e53-a495-4c99-aa1b-421cfbc638b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d017e53-a495-4c99-aa1b-421cfbc638b4"}
```
