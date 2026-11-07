# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 60 | `qa-092df188-7691-42fc-97d9-f25a8a630b35` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-eef50ed4-caaf-4ae9-ac1c-8d5e9c7197bd` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-b7ba8268-d042-4ea6-a1c7-808cba0039d2` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-9587ada7-c022-4243-b478-0f97b47eaac4` |
| 5 | `POST /v1/conversations` | 503 | 14 | `qa-9b922100-b4c5-4610-a65c-078d905fe38f` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-8fbd6af4-33a9-4257-b44c-419e0bef0986` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-1d3648b8-678b-4f49-b9f7-c8f12358c4a9` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-8f0a809e-901c-4c34-957b-0214178d86ae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-a97b33e5-279e-424d-aa52-02beff26a65a` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-180d746c-c106-434d-b73c-e8074bc9acc0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-092df188-7691-42fc-97d9-f25a8a630b35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-092df188-7691-42fc-97d9-f25a8a630b35
Content-Type: application/json

--- request body ---
{"handle":"qa-7852170ff922","displayName":"QA 7852170ff922","password":"****","region":"eu"}

--- response: 201 in 60 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-092df188-7691-42fc-97d9-f25a8a630b35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 8
Location: /v1/accounts/qa-7852170ff922
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7e398c66-6a5a-4d11-a968-532a22da7b6a","handle":"qa-7852170ff922","displayName":"QA 7852170ff922","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.416037913Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eef50ed4-caaf-4ae9-ac1c-8d5e9c7197bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eef50ed4-caaf-4ae9-ac1c-8d5e9c7197bd
Content-Type: application/json

--- request body ---
{"handle":"qa-97a294671994","displayName":"QA 97a294671994","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-eef50ed4-caaf-4ae9-ac1c-8d5e9c7197bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Location: /v1/accounts/qa-97a294671994
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c880ade6-e02c-4b11-bf65-d4cd75b49b19","handle":"qa-97a294671994","displayName":"QA 97a294671994","region":"eu","role":"user","createdAt":"2026-11-07T08:54:58.494640827Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b7ba8268-d042-4ea6-a1c7-808cba0039d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7ba8268-d042-4ea6-a1c7-808cba0039d2
Content-Type: application/json

--- request body ---
{"handle":"qa-7852170ff922","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7ba8268-d042-4ea6-a1c7-808cba0039d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7e398c66-6a5a-4d11-a968-532a22da7b6a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9587ada7-c022-4243-b478-0f97b47eaac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9587ada7-c022-4243-b478-0f97b47eaac4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-97a294671994","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9587ada7-c022-4243-b478-0f97b47eaac4
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
Location: /v1/conversations/cnv_822f717b-5217-4ea5-a74f-1d2f7a9fe40d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_822f717b-5217-4ea5-a74f-1d2f7a9fe40d","subject":"Error contract","status":"open","region":"eu","participants":["qa-7852170ff922","qa-97a294671994"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:58.535652849Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9b922100-b4c5-4610-a65c-078d905fe38f

--- request headers ---
Accept: application/json
X-Fault-Key: 106bd2c3-14a8-4f9d-8c02-e82d9906e736
X-Fault: unavailable-once
X-Correlation-Id: qa-9b922100-b4c5-4610-a65c-078d905fe38f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7852170ff922","subject":"Probe","message":"Hi"}

--- response: 503 in 14 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b922100-b4c5-4610-a65c-078d905fe38f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-9b922100-b4c5-4610-a65c-078d905fe38f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8fbd6af4-33a9-4257-b44c-419e0bef0986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fbd6af4-33a9-4257-b44c-419e0bef0986
Content-Type: application/json

--- request body ---
{"handle":"qa-97a294671994","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fbd6af4-33a9-4257-b44c-419e0bef0986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c880ade6-e02c-4b11-bf65-d4cd75b49b19"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1d3648b8-678b-4f49-b9f7-c8f12358c4a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d3648b8-678b-4f49-b9f7-c8f12358c4a9
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1d3648b8-678b-4f49-b9f7-c8f12358c4a9
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
correlation: qa-8f0a809e-901c-4c34-957b-0214178d86ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f0a809e-901c-4c34-957b-0214178d86ae
Content-Type: application/json

--- request body ---
{"handle":"qa-97a294671994","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f0a809e-901c-4c34-957b-0214178d86ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f0a809e-901c-4c34-957b-0214178d86ae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a97b33e5-279e-424d-aa52-02beff26a65a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a97b33e5-279e-424d-aa52-02beff26a65a
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a97b33e5-279e-424d-aa52-02beff26a65a
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
correlation: qa-180d746c-c106-434d-b73c-e8074bc9acc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-180d746c-c106-434d-b73c-e8074bc9acc0
Content-Type: application/json

--- request body ---
{"handle":"qa-7852170ff922","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-180d746c-c106-434d-b73c-e8074bc9acc0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-180d746c-c106-434d-b73c-e8074bc9acc0"}
```
