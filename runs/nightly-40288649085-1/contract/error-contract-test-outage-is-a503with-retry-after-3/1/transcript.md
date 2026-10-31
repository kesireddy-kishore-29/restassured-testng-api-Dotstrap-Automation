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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-eba2a717-1352-4bca-8299-c247aeffa09f` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-8138c6c2-83a3-4df9-b162-61194118b241` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-f998a48f-a82e-447f-988f-4e09a402aec4` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-90d4d34b-30da-4737-85df-b555c219657b` |
| 5 | `PATCH /v1/accounts/me` | 503 | 12 | `qa-d1f13498-ec77-4aba-9603-7271b9691073` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-dc002282-bbf9-4366-8852-41059a9c7e63` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c6252ba0-7ef7-4b4d-9852-a5363e0b0bc9` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-120cf3a8-f2b0-43cd-9c0e-e49d6ca1e9c5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-176b553d-36ba-4a08-8329-9836c220dcd1` |
| 10 | `POST /v1/auth/token` | 401 | 50 | `qa-cc69304d-ec2e-4c74-ab21-c928f27b33b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-eba2a717-1352-4bca-8299-c247aeffa09f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba2a717-1352-4bca-8299-c247aeffa09f
Content-Type: application/json

--- request body ---
{"handle":"qa-83f39bee2ae6","displayName":"QA 83f39bee2ae6","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-eba2a717-1352-4bca-8299-c247aeffa09f
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
Location: /v1/accounts/qa-83f39bee2ae6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fed2dcb2-5815-4206-89a7-9ce46c3f888a","handle":"qa-83f39bee2ae6","displayName":"QA 83f39bee2ae6","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.274221275Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8138c6c2-83a3-4df9-b162-61194118b241

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8138c6c2-83a3-4df9-b162-61194118b241
Content-Type: application/json

--- request body ---
{"handle":"qa-832c2e0eb87e","displayName":"QA 832c2e0eb87e","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8138c6c2-83a3-4df9-b162-61194118b241
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Location: /v1/accounts/qa-832c2e0eb87e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_de1aff69-7e7c-4874-92f7-46cb05ef881c","handle":"qa-832c2e0eb87e","displayName":"QA 832c2e0eb87e","region":"eu","role":"user","createdAt":"2026-10-26T07:54:46.350931307Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f998a48f-a82e-447f-988f-4e09a402aec4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f998a48f-a82e-447f-988f-4e09a402aec4
Content-Type: application/json

--- request body ---
{"handle":"qa-83f39bee2ae6","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-f998a48f-a82e-447f-988f-4e09a402aec4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fed2dcb2-5815-4206-89a7-9ce46c3f888a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-90d4d34b-30da-4737-85df-b555c219657b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90d4d34b-30da-4737-85df-b555c219657b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-832c2e0eb87e","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-90d4d34b-30da-4737-85df-b555c219657b
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
Location: /v1/conversations/cnv_3e2ff893-1f09-4588-b1ef-08f809c3af64
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3e2ff893-1f09-4588-b1ef-08f809c3af64","subject":"Error contract","status":"open","region":"eu","participants":["qa-83f39bee2ae6","qa-832c2e0eb87e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:46.431886601Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-d1f13498-ec77-4aba-9603-7271b9691073

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a9f672c8-5020-4157-a762-3c3d2738fde6
X-Correlation-Id: qa-d1f13498-ec77-4aba-9603-7271b9691073
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1f13498-ec77-4aba-9603-7271b9691073
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-d1f13498-ec77-4aba-9603-7271b9691073"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-dc002282-bbf9-4366-8852-41059a9c7e63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc002282-bbf9-4366-8852-41059a9c7e63
Content-Type: application/json

--- request body ---
{"handle":"qa-832c2e0eb87e","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc002282-bbf9-4366-8852-41059a9c7e63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_de1aff69-7e7c-4874-92f7-46cb05ef881c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6252ba0-7ef7-4b4d-9852-a5363e0b0bc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6252ba0-7ef7-4b4d-9852-a5363e0b0bc9
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6252ba0-7ef7-4b4d-9852-a5363e0b0bc9
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
correlation: qa-120cf3a8-f2b0-43cd-9c0e-e49d6ca1e9c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-120cf3a8-f2b0-43cd-9c0e-e49d6ca1e9c5
Content-Type: application/json

--- request body ---
{"handle":"qa-832c2e0eb87e","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-120cf3a8-f2b0-43cd-9c0e-e49d6ca1e9c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-120cf3a8-f2b0-43cd-9c0e-e49d6ca1e9c5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-176b553d-36ba-4a08-8329-9836c220dcd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176b553d-36ba-4a08-8329-9836c220dcd1
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-176b553d-36ba-4a08-8329-9836c220dcd1
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
correlation: qa-cc69304d-ec2e-4c74-ab21-c928f27b33b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc69304d-ec2e-4c74-ab21-c928f27b33b1
Content-Type: application/json

--- request body ---
{"handle":"qa-83f39bee2ae6","password":"****"}

--- response: 401 in 50 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc69304d-ec2e-4c74-ab21-c928f27b33b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc69304d-ec2e-4c74-ab21-c928f27b33b1"}
```
