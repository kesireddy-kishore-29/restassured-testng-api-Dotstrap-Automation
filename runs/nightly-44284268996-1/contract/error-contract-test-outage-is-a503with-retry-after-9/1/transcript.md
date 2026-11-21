# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-0e4fd462-53fe-4a92-9dac-a786e958fd78` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-bef233d1-84d9-4933-a571-06345764ddb5` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-bb513fea-35ba-4ac4-b8fe-105925409868` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-2f81afce-37c0-4806-9687-05db947ced29` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 19 | `qa-d26f9aac-7d9f-4d26-af13-f178e8966f31` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-42a2a198-70e9-46d1-910f-8ab7041993b3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-02062a9c-108e-4e31-8776-9e9bef5d18d0` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-eda90dcc-73dc-48e4-8203-d6f486bcda34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-dafbb39c-ec71-4f77-a228-f785778225a7` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-cbfaf5c3-6e4d-49a3-a060-5e70d5eea430` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0e4fd462-53fe-4a92-9dac-a786e958fd78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e4fd462-53fe-4a92-9dac-a786e958fd78
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4a086b6ecd","displayName":"QA ef4a086b6ecd","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e4fd462-53fe-4a92-9dac-a786e958fd78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Location: /v1/accounts/qa-ef4a086b6ecd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_495b92bf-085f-478b-af1a-b5370ab0e643","handle":"qa-ef4a086b6ecd","displayName":"QA ef4a086b6ecd","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.105486615Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bef233d1-84d9-4933-a571-06345764ddb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bef233d1-84d9-4933-a571-06345764ddb5
Content-Type: application/json

--- request body ---
{"handle":"qa-8b06bcbfe4af","displayName":"QA 8b06bcbfe4af","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bef233d1-84d9-4933-a571-06345764ddb5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 8
Location: /v1/accounts/qa-8b06bcbfe4af
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7513e26b-7596-4c68-85c0-7142691b229d","handle":"qa-8b06bcbfe4af","displayName":"QA 8b06bcbfe4af","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.132790173Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bb513fea-35ba-4ac4-b8fe-105925409868

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb513fea-35ba-4ac4-b8fe-105925409868
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4a086b6ecd","password":"****"}

--- response: 200 in 44 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb513fea-35ba-4ac4-b8fe-105925409868
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_495b92bf-085f-478b-af1a-b5370ab0e643"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2f81afce-37c0-4806-9687-05db947ced29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f81afce-37c0-4806-9687-05db947ced29
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8b06bcbfe4af","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f81afce-37c0-4806-9687-05db947ced29
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
Location: /v1/conversations/cnv_983f7f49-6ca4-4bf3-95d7-ad70637e0b67
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_983f7f49-6ca4-4bf3-95d7-ad70637e0b67","subject":"Error contract","status":"open","region":"eu","participants":["qa-ef4a086b6ecd","qa-8b06bcbfe4af"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.195962458Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_983f7f49-6ca4-4bf3-95d7-ad70637e0b67/messages
correlation: qa-d26f9aac-7d9f-4d26-af13-f178e8966f31

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 14e866f2-e5dc-4dff-b075-fc027186ca4b
X-Correlation-Id: qa-d26f9aac-7d9f-4d26-af13-f178e8966f31
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d26f9aac-7d9f-4d26-af13-f178e8966f31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_983f7f49-6ca4-4bf3-95d7-ad70637e0b67/messages","correlationId":"qa-d26f9aac-7d9f-4d26-af13-f178e8966f31"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-42a2a198-70e9-46d1-910f-8ab7041993b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42a2a198-70e9-46d1-910f-8ab7041993b3
Content-Type: application/json

--- request body ---
{"handle":"qa-8b06bcbfe4af","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-42a2a198-70e9-46d1-910f-8ab7041993b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7513e26b-7596-4c68-85c0-7142691b229d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02062a9c-108e-4e31-8776-9e9bef5d18d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02062a9c-108e-4e31-8776-9e9bef5d18d0
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02062a9c-108e-4e31-8776-9e9bef5d18d0
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
correlation: qa-eda90dcc-73dc-48e4-8203-d6f486bcda34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eda90dcc-73dc-48e4-8203-d6f486bcda34
Content-Type: application/json

--- request body ---
{"handle":"qa-8b06bcbfe4af","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eda90dcc-73dc-48e4-8203-d6f486bcda34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eda90dcc-73dc-48e4-8203-d6f486bcda34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dafbb39c-ec71-4f77-a228-f785778225a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dafbb39c-ec71-4f77-a228-f785778225a7
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dafbb39c-ec71-4f77-a228-f785778225a7
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
correlation: qa-cbfaf5c3-6e4d-49a3-a060-5e70d5eea430

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbfaf5c3-6e4d-49a3-a060-5e70d5eea430
Content-Type: application/json

--- request body ---
{"handle":"qa-ef4a086b6ecd","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cbfaf5c3-6e4d-49a3-a060-5e70d5eea430
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cbfaf5c3-6e4d-49a3-a060-5e70d5eea430"}
```
