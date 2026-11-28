# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-334ae670-7e70-4f49-80de-9bcbb5bd514b` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-46286c4a-2e86-4f11-a1ca-a33ddb59abe9` |
| 3 | `POST /v1/auth/token` | 200 | 9 | `qa-b97d1f78-ee28-4845-ab21-56d454532030` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-8c3a5095-a099-48fa-97e8-e209c3f6c9af` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 15 | `qa-6a487d89-148b-48cc-b5f0-aaf2a5b38dfe` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-b767b7db-16d4-4fcb-bc7c-5e58a788c7d4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-b8208827-c19a-480d-ae20-6c82ea896bb9` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-7a4fb8ab-f3b9-40aa-94de-778acf795931` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-cce473c0-5405-4ec3-97f9-8a1dfe5df17c` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-74df6b2d-290c-4016-83ad-f95167c5f529` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-334ae670-7e70-4f49-80de-9bcbb5bd514b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-334ae670-7e70-4f49-80de-9bcbb5bd514b
Content-Type: application/json

--- request body ---
{"handle":"qa-c9644520b1db","displayName":"QA c9644520b1db","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-334ae670-7e70-4f49-80de-9bcbb5bd514b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 360
RateLimit-Reset: 8
Location: /v1/accounts/qa-c9644520b1db
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ee3eaa1-6ae3-4b9a-be68-309e4c61012d","handle":"qa-c9644520b1db","displayName":"QA c9644520b1db","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.041878216Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-46286c4a-2e86-4f11-a1ca-a33ddb59abe9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46286c4a-2e86-4f11-a1ca-a33ddb59abe9
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5315eb626b","displayName":"QA aa5315eb626b","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-46286c4a-2e86-4f11-a1ca-a33ddb59abe9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Location: /v1/accounts/qa-aa5315eb626b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_57faee96-95aa-4c45-a3e5-3a9bada8429b","handle":"qa-aa5315eb626b","displayName":"QA aa5315eb626b","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.107029210Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b97d1f78-ee28-4845-ab21-56d454532030

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b97d1f78-ee28-4845-ab21-56d454532030
Content-Type: application/json

--- request body ---
{"handle":"qa-c9644520b1db","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b97d1f78-ee28-4845-ab21-56d454532030
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ee3eaa1-6ae3-4b9a-be68-309e4c61012d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8c3a5095-a099-48fa-97e8-e209c3f6c9af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c3a5095-a099-48fa-97e8-e209c3f6c9af
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aa5315eb626b","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c3a5095-a099-48fa-97e8-e209c3f6c9af
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
Location: /v1/conversations/cnv_1aa2ccd4-f682-4481-9f53-9a57b9f44da6
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1aa2ccd4-f682-4481-9f53-9a57b9f44da6","subject":"Error contract","status":"open","region":"eu","participants":["qa-c9644520b1db","qa-aa5315eb626b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:42.147107441Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_1aa2ccd4-f682-4481-9f53-9a57b9f44da6/messages
correlation: qa-6a487d89-148b-48cc-b5f0-aaf2a5b38dfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a487d89-148b-48cc-b5f0-aaf2a5b38dfe
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6a487d89-148b-48cc-b5f0-aaf2a5b38dfe
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_1aa2ccd4-f682-4481-9f53-9a57b9f44da6/messages","correlationId":"qa-6a487d89-148b-48cc-b5f0-aaf2a5b38dfe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b767b7db-16d4-4fcb-bc7c-5e58a788c7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b767b7db-16d4-4fcb-bc7c-5e58a788c7d4
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5315eb626b","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-b767b7db-16d4-4fcb-bc7c-5e58a788c7d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_57faee96-95aa-4c45-a3e5-3a9bada8429b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8208827-c19a-480d-ae20-6c82ea896bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8208827-c19a-480d-ae20-6c82ea896bb9
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8208827-c19a-480d-ae20-6c82ea896bb9
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
correlation: qa-7a4fb8ab-f3b9-40aa-94de-778acf795931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a4fb8ab-f3b9-40aa-94de-778acf795931
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5315eb626b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a4fb8ab-f3b9-40aa-94de-778acf795931
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7a4fb8ab-f3b9-40aa-94de-778acf795931"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cce473c0-5405-4ec3-97f9-8a1dfe5df17c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce473c0-5405-4ec3-97f9-8a1dfe5df17c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cce473c0-5405-4ec3-97f9-8a1dfe5df17c
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
correlation: qa-74df6b2d-290c-4016-83ad-f95167c5f529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74df6b2d-290c-4016-83ad-f95167c5f529
Content-Type: application/json

--- request body ---
{"handle":"qa-c9644520b1db","password":"****"}

--- response: 401 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74df6b2d-290c-4016-83ad-f95167c5f529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74df6b2d-290c-4016-83ad-f95167c5f529"}
```
