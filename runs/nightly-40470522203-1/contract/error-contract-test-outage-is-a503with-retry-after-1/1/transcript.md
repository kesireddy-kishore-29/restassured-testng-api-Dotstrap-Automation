# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 52 | `qa-6d176e4e-7e61-47fe-9a87-d131a5b9ff14` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-28db8256-02a3-4746-baaf-2ea0f85e55ed` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-190a0fa8-8495-4057-b3f8-93e273dfad78` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-bb7a1a94-fe0b-42bd-8420-27eb6f75d9e0` |
| 5 | `POST /v1/accounts` | 503 | 30 | `qa-372584f2-9cbb-446d-a3fb-05bd2aceff03` |
| 6 | `POST /v1/auth/token` | 200 | 78 | `qa-4117ebdd-eca6-409a-8de9-ee46fc8e750b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-58686ad4-7c80-4050-86f8-827290ad1087` |
| 8 | `POST /v1/auth/token` | 401 | 33 | `qa-a4d645fe-4fa5-4ffa-b660-8845c87fbd4f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-580ed129-19bc-4fe7-9ed6-5f105a5c3c77` |
| 10 | `POST /v1/auth/token` | 401 | 40 | `qa-ec4a97e5-6aa1-41a7-a3ad-c2187b68be5f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d176e4e-7e61-47fe-9a87-d131a5b9ff14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d176e4e-7e61-47fe-9a87-d131a5b9ff14
Content-Type: application/json

--- request body ---
{"handle":"qa-b347ff200d4a","displayName":"QA b347ff200d4a","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d176e4e-7e61-47fe-9a87-d131a5b9ff14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-b347ff200d4a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_813b76a5-0679-47c9-bff7-1da33e333392","handle":"qa-b347ff200d4a","displayName":"QA b347ff200d4a","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.463497323Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-28db8256-02a3-4746-baaf-2ea0f85e55ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28db8256-02a3-4746-baaf-2ea0f85e55ed
Content-Type: application/json

--- request body ---
{"handle":"qa-12b87448decc","displayName":"QA 12b87448decc","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-28db8256-02a3-4746-baaf-2ea0f85e55ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-12b87448decc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f67066ac-0122-4915-946b-cf2b292c9f03","handle":"qa-12b87448decc","displayName":"QA 12b87448decc","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.523440269Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-190a0fa8-8495-4057-b3f8-93e273dfad78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190a0fa8-8495-4057-b3f8-93e273dfad78
Content-Type: application/json

--- request body ---
{"handle":"qa-b347ff200d4a","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-190a0fa8-8495-4057-b3f8-93e273dfad78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_813b76a5-0679-47c9-bff7-1da33e333392"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb7a1a94-fe0b-42bd-8420-27eb6f75d9e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb7a1a94-fe0b-42bd-8420-27eb6f75d9e0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-12b87448decc","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb7a1a94-fe0b-42bd-8420-27eb6f75d9e0
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
Location: /v1/conversations/cnv_ed55f6af-b43d-4ecb-9e02-6eda159574fa
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ed55f6af-b43d-4ecb-9e02-6eda159574fa","subject":"Error contract","status":"open","region":"eu","participants":["qa-b347ff200d4a","qa-12b87448decc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.632877640Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-372584f2-9cbb-446d-a3fb-05bd2aceff03

--- request headers ---
Accept: application/json
X-Fault-Key: 426e5511-ac1d-49ef-aef4-ed04c180be6d
X-Fault: unavailable-once
X-Correlation-Id: qa-372584f2-9cbb-446d-a3fb-05bd2aceff03
Content-Type: application/json

--- request body ---
{"handle":"qa-712821c38d1f","displayName":"QA 712821c38d1f","password":"****","region":"eu"}

--- response: 503 in 30 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-372584f2-9cbb-446d-a3fb-05bd2aceff03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-372584f2-9cbb-446d-a3fb-05bd2aceff03"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4117ebdd-eca6-409a-8de9-ee46fc8e750b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4117ebdd-eca6-409a-8de9-ee46fc8e750b
Content-Type: application/json

--- request body ---
{"handle":"qa-12b87448decc","password":"****"}

--- response: 200 in 78 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-4117ebdd-eca6-409a-8de9-ee46fc8e750b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f67066ac-0122-4915-946b-cf2b292c9f03"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-58686ad4-7c80-4050-86f8-827290ad1087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58686ad4-7c80-4050-86f8-827290ad1087
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-58686ad4-7c80-4050-86f8-827290ad1087
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
correlation: qa-a4d645fe-4fa5-4ffa-b660-8845c87fbd4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4d645fe-4fa5-4ffa-b660-8845c87fbd4f
Content-Type: application/json

--- request body ---
{"handle":"qa-12b87448decc","password":"****"}

--- response: 401 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4d645fe-4fa5-4ffa-b660-8845c87fbd4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a4d645fe-4fa5-4ffa-b660-8845c87fbd4f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-580ed129-19bc-4fe7-9ed6-5f105a5c3c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-580ed129-19bc-4fe7-9ed6-5f105a5c3c77
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-580ed129-19bc-4fe7-9ed6-5f105a5c3c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ec4a97e5-6aa1-41a7-a3ad-c2187b68be5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec4a97e5-6aa1-41a7-a3ad-c2187b68be5f
Content-Type: application/json

--- request body ---
{"handle":"qa-b347ff200d4a","password":"****"}

--- response: 401 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec4a97e5-6aa1-41a7-a3ad-c2187b68be5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec4a97e5-6aa1-41a7-a3ad-c2187b68be5f"}
```
