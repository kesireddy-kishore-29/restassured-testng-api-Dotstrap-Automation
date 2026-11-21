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
| 1 | `POST /v1/accounts` | 201 | 48 | `qa-ba75ea1a-036e-4437-ac53-4b284208d17f` |
| 2 | `POST /v1/accounts` | 201 | 19 | `qa-0d4307c3-6af9-4833-9b82-288af8946a35` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-44f7dae6-ccef-4506-ac58-03a29e24efe4` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-80179312-a9e8-4fc3-af4f-d81034ea4d00` |
| 5 | `POST /v1/conversations` | 503 | 12 | `qa-af6c6416-0511-45b3-ab9f-a4564305106d` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-0422c2ce-8824-4da6-b0a5-d80d3f681e6b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-9d6bcc9a-e8be-487f-a8cc-93496626c72e` |
| 8 | `POST /v1/auth/token` | 401 | 28 | `qa-9d853995-eb3b-4a6c-989d-fb24b692e4aa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-fd1fb845-822e-4acf-9fc4-94dbac8c3136` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-6393af4f-6d15-460e-993e-b32d6f679c88` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ba75ea1a-036e-4437-ac53-4b284208d17f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba75ea1a-036e-4437-ac53-4b284208d17f
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0d2c77367a","displayName":"QA 5a0d2c77367a","password":"****","region":"eu"}

--- response: 201 in 48 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba75ea1a-036e-4437-ac53-4b284208d17f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Location: /v1/accounts/qa-5a0d2c77367a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_441977be-f144-4cd1-8081-65dd4e34f308","handle":"qa-5a0d2c77367a","displayName":"QA 5a0d2c77367a","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.705692991Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0d4307c3-6af9-4833-9b82-288af8946a35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d4307c3-6af9-4833-9b82-288af8946a35
Content-Type: application/json

--- request body ---
{"handle":"qa-92e7dfd4954d","displayName":"QA 92e7dfd4954d","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d4307c3-6af9-4833-9b82-288af8946a35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Location: /v1/accounts/qa-92e7dfd4954d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fcb0d6f5-791a-4b3d-b18d-24107400925a","handle":"qa-92e7dfd4954d","displayName":"QA 92e7dfd4954d","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.738192570Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-44f7dae6-ccef-4506-ac58-03a29e24efe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44f7dae6-ccef-4506-ac58-03a29e24efe4
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0d2c77367a","password":"****"}

--- response: 200 in 32 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-44f7dae6-ccef-4506-ac58-03a29e24efe4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_441977be-f144-4cd1-8081-65dd4e34f308"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-80179312-a9e8-4fc3-af4f-d81034ea4d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80179312-a9e8-4fc3-af4f-d81034ea4d00
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-92e7dfd4954d","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-80179312-a9e8-4fc3-af4f-d81034ea4d00
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
Location: /v1/conversations/cnv_7172c004-12ea-410a-8443-1f85a1090bbc
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7172c004-12ea-410a-8443-1f85a1090bbc","subject":"Error contract","status":"open","region":"eu","participants":["qa-5a0d2c77367a","qa-92e7dfd4954d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:51.846120945Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-af6c6416-0511-45b3-ab9f-a4564305106d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a8feb2b0-77cd-4fdf-bcfa-3e68fecdeeb0
X-Correlation-Id: qa-af6c6416-0511-45b3-ab9f-a4564305106d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5a0d2c77367a","subject":"Probe","message":"Hi"}

--- response: 503 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af6c6416-0511-45b3-ab9f-a4564305106d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-af6c6416-0511-45b3-ab9f-a4564305106d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0422c2ce-8824-4da6-b0a5-d80d3f681e6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0422c2ce-8824-4da6-b0a5-d80d3f681e6b
Content-Type: application/json

--- request body ---
{"handle":"qa-92e7dfd4954d","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0422c2ce-8824-4da6-b0a5-d80d3f681e6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fcb0d6f5-791a-4b3d-b18d-24107400925a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d6bcc9a-e8be-487f-a8cc-93496626c72e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d6bcc9a-e8be-487f-a8cc-93496626c72e
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d6bcc9a-e8be-487f-a8cc-93496626c72e
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
correlation: qa-9d853995-eb3b-4a6c-989d-fb24b692e4aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d853995-eb3b-4a6c-989d-fb24b692e4aa
Content-Type: application/json

--- request body ---
{"handle":"qa-92e7dfd4954d","password":"****"}

--- response: 401 in 28 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d853995-eb3b-4a6c-989d-fb24b692e4aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d853995-eb3b-4a6c-989d-fb24b692e4aa"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd1fb845-822e-4acf-9fc4-94dbac8c3136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd1fb845-822e-4acf-9fc4-94dbac8c3136
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd1fb845-822e-4acf-9fc4-94dbac8c3136
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
correlation: qa-6393af4f-6d15-460e-993e-b32d6f679c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6393af4f-6d15-460e-993e-b32d6f679c88
Content-Type: application/json

--- request body ---
{"handle":"qa-5a0d2c77367a","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6393af4f-6d15-460e-993e-b32d6f679c88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6393af4f-6d15-460e-993e-b32d6f679c88"}
```
