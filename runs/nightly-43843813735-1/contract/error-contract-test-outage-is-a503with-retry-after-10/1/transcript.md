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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-45d77d2e-2431-46e1-97a8-416dceeeac7a` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-1e4ff400-7cd4-4e25-b444-ef3db6e139d2` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-026ae452-7f7b-437f-80ea-bb6769400667` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-99fa282a-8e35-4ed9-9801-bdf187a2b6f1` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 23 | `qa-a4dc1a8f-860e-4fb3-9c87-7416bdff4c14` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-cfeca115-66e5-4614-a510-06a2d0df4705` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ee1a3725-e85c-4c18-a18c-df2928dbefec` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-359fd883-f676-4f68-b264-3675168407a7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-02b87b02-9616-46ba-bb34-18d81ecde8aa` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-921f4ced-c0ce-4e8d-9399-dfe104dd4b7d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45d77d2e-2431-46e1-97a8-416dceeeac7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45d77d2e-2431-46e1-97a8-416dceeeac7a
Content-Type: application/json

--- request body ---
{"handle":"qa-060e1d5a8216","displayName":"QA 060e1d5a8216","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-45d77d2e-2431-46e1-97a8-416dceeeac7a
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
Location: /v1/accounts/qa-060e1d5a8216
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05ae23b6-b929-4c60-a16a-11846ef01617","handle":"qa-060e1d5a8216","displayName":"QA 060e1d5a8216","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.674956380Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1e4ff400-7cd4-4e25-b444-ef3db6e139d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e4ff400-7cd4-4e25-b444-ef3db6e139d2
Content-Type: application/json

--- request body ---
{"handle":"qa-2046fb5459a0","displayName":"QA 2046fb5459a0","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e4ff400-7cd4-4e25-b444-ef3db6e139d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-2046fb5459a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dad8e995-4d31-4a1e-be15-975d1a095100","handle":"qa-2046fb5459a0","displayName":"QA 2046fb5459a0","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.716227346Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-026ae452-7f7b-437f-80ea-bb6769400667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-026ae452-7f7b-437f-80ea-bb6769400667
Content-Type: application/json

--- request body ---
{"handle":"qa-060e1d5a8216","password":"****"}

--- response: 200 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-026ae452-7f7b-437f-80ea-bb6769400667
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05ae23b6-b929-4c60-a16a-11846ef01617"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-99fa282a-8e35-4ed9-9801-bdf187a2b6f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fa282a-8e35-4ed9-9801-bdf187a2b6f1
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2046fb5459a0","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-99fa282a-8e35-4ed9-9801-bdf187a2b6f1
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
Location: /v1/conversations/cnv_2c780e87-afe5-4c47-a9b3-f52e2463c618
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2c780e87-afe5-4c47-a9b3-f52e2463c618","subject":"Error contract","status":"open","region":"eu","participants":["qa-060e1d5a8216","qa-2046fb5459a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.765421661Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2c780e87-afe5-4c47-a9b3-f52e2463c618/messages
correlation: qa-a4dc1a8f-860e-4fb3-9c87-7416bdff4c14

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b63356eb-f035-4d02-bda1-fe8415ef446b
X-Correlation-Id: qa-a4dc1a8f-860e-4fb3-9c87-7416bdff4c14
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4dc1a8f-860e-4fb3-9c87-7416bdff4c14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_2c780e87-afe5-4c47-a9b3-f52e2463c618/messages","correlationId":"qa-a4dc1a8f-860e-4fb3-9c87-7416bdff4c14"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cfeca115-66e5-4614-a510-06a2d0df4705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfeca115-66e5-4614-a510-06a2d0df4705
Content-Type: application/json

--- request body ---
{"handle":"qa-2046fb5459a0","password":"****"}

--- response: 200 in 35 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfeca115-66e5-4614-a510-06a2d0df4705
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dad8e995-4d31-4a1e-be15-975d1a095100"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee1a3725-e85c-4c18-a18c-df2928dbefec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee1a3725-e85c-4c18-a18c-df2928dbefec
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee1a3725-e85c-4c18-a18c-df2928dbefec
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
correlation: qa-359fd883-f676-4f68-b264-3675168407a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-359fd883-f676-4f68-b264-3675168407a7
Content-Type: application/json

--- request body ---
{"handle":"qa-2046fb5459a0","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-359fd883-f676-4f68-b264-3675168407a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-359fd883-f676-4f68-b264-3675168407a7"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02b87b02-9616-46ba-bb34-18d81ecde8aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02b87b02-9616-46ba-bb34-18d81ecde8aa
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02b87b02-9616-46ba-bb34-18d81ecde8aa
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
correlation: qa-921f4ced-c0ce-4e8d-9399-dfe104dd4b7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-921f4ced-c0ce-4e8d-9399-dfe104dd4b7d
Content-Type: application/json

--- request body ---
{"handle":"qa-060e1d5a8216","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-921f4ced-c0ce-4e8d-9399-dfe104dd4b7d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-921f4ced-c0ce-4e8d-9399-dfe104dd4b7d"}
```
