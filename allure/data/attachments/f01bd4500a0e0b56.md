# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 45 | `qa-0ac68731-90fc-43ea-bd65-e9eba6e634fb` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-c86e3844-c4b3-4126-a62c-b8b20c1fc9db` |
| 3 | `POST /v1/auth/token` | 200 | 61 | `qa-ee5f34ac-d28a-44e1-b7d9-76b362a9a946` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-f513137f-3e33-4792-8043-650827467529` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 32 | `qa-26ef8b7b-bd7b-4b79-8b9e-de13a556ec90` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-f201f58b-f7fb-4847-8652-dcbaee5c5179` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-84395a09-ca56-48cf-bd46-24cbf4d44546` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-bf61eff5-4544-48c8-a3ac-e225b69b4a76` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-d5c9f744-a32d-46ed-af22-90b629bf456d` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-f34a7f60-1ab6-4ec7-b10f-edf3966870f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0ac68731-90fc-43ea-bd65-e9eba6e634fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac68731-90fc-43ea-bd65-e9eba6e634fb
Content-Type: application/json

--- request body ---
{"handle":"qa-2a371bf08ed3","displayName":"QA 2a371bf08ed3","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 31 Oct 2026 08:31:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ac68731-90fc-43ea-bd65-e9eba6e634fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Location: /v1/accounts/qa-2a371bf08ed3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8b2f6f48-8868-4645-a85d-e2046e9e29b7","handle":"qa-2a371bf08ed3","displayName":"QA 2a371bf08ed3","region":"eu","role":"user","createdAt":"2026-10-31T08:31:34.946554094Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c86e3844-c4b3-4126-a62c-b8b20c1fc9db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86e3844-c4b3-4126-a62c-b8b20c1fc9db
Content-Type: application/json

--- request body ---
{"handle":"qa-535db5c56cf8","displayName":"QA 535db5c56cf8","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c86e3844-c4b3-4126-a62c-b8b20c1fc9db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Location: /v1/accounts/qa-535db5c56cf8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1be42a22-37bf-417e-8ded-70e3e51bf998","handle":"qa-535db5c56cf8","displayName":"QA 535db5c56cf8","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.018725366Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ee5f34ac-d28a-44e1-b7d9-76b362a9a946

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5f34ac-d28a-44e1-b7d9-76b362a9a946
Content-Type: application/json

--- request body ---
{"handle":"qa-2a371bf08ed3","password":"****"}

--- response: 200 in 61 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee5f34ac-d28a-44e1-b7d9-76b362a9a946
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8b2f6f48-8868-4645-a85d-e2046e9e29b7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f513137f-3e33-4792-8043-650827467529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f513137f-3e33-4792-8043-650827467529
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-535db5c56cf8","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f513137f-3e33-4792-8043-650827467529
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
Location: /v1/conversations/cnv_f3af3ea1-8576-4de6-826c-7d929d135423
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3af3ea1-8576-4de6-826c-7d929d135423","subject":"Error contract","status":"open","region":"eu","participants":["qa-2a371bf08ed3","qa-535db5c56cf8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.193582813Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-2a371bf08ed3
correlation: qa-26ef8b7b-bd7b-4b79-8b9e-de13a556ec90

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: f9ddaa21-ab0a-470d-a0d8-732525f95273
X-Correlation-Id: qa-26ef8b7b-bd7b-4b79-8b9e-de13a556ec90
Content-Type: application/json

--- response: 503 in 32 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26ef8b7b-bd7b-4b79-8b9e-de13a556ec90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-2a371bf08ed3","correlationId":"qa-26ef8b7b-bd7b-4b79-8b9e-de13a556ec90"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f201f58b-f7fb-4847-8652-dcbaee5c5179

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f201f58b-f7fb-4847-8652-dcbaee5c5179
Content-Type: application/json

--- request body ---
{"handle":"qa-535db5c56cf8","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f201f58b-f7fb-4847-8652-dcbaee5c5179
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1be42a22-37bf-417e-8ded-70e3e51bf998"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-84395a09-ca56-48cf-bd46-24cbf4d44546

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84395a09-ca56-48cf-bd46-24cbf4d44546
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-84395a09-ca56-48cf-bd46-24cbf4d44546
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
correlation: qa-bf61eff5-4544-48c8-a3ac-e225b69b4a76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf61eff5-4544-48c8-a3ac-e225b69b4a76
Content-Type: application/json

--- request body ---
{"handle":"qa-535db5c56cf8","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bf61eff5-4544-48c8-a3ac-e225b69b4a76
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bf61eff5-4544-48c8-a3ac-e225b69b4a76"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5c9f744-a32d-46ed-af22-90b629bf456d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5c9f744-a32d-46ed-af22-90b629bf456d
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5c9f744-a32d-46ed-af22-90b629bf456d
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
correlation: qa-f34a7f60-1ab6-4ec7-b10f-edf3966870f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34a7f60-1ab6-4ec7-b10f-edf3966870f0
Content-Type: application/json

--- request body ---
{"handle":"qa-2a371bf08ed3","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f34a7f60-1ab6-4ec7-b10f-edf3966870f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f34a7f60-1ab6-4ec7-b10f-edf3966870f0"}
```
