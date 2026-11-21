# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-a939a792-0178-497b-ace7-93165c24db97` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-ad116267-21b9-4b9e-afef-97d24ae26caa` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-36cc6ae8-76c4-4b92-9663-f56eaf66ae8b` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-643ffc73-f9de-434c-93fd-078ecfffd612` |
| 5 | `POST /v1/credits/purchases` | 503 | 14 | `qa-e68ad77b-d603-4ab5-8307-93f50f36c9bf` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-7f7cf2db-fdbb-467f-9b30-ddc34510bd83` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-71d80602-ac98-4cc7-aa37-f4342074add4` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-9b05208e-209f-4bb8-88e3-672a6100ba39` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f14f9875-3885-41b1-b156-afe93cfc04a0` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-94024cc3-61cd-41d6-b05e-296785596b6f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a939a792-0178-497b-ace7-93165c24db97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a939a792-0178-497b-ace7-93165c24db97
Content-Type: application/json

--- request body ---
{"handle":"qa-311e5480dadd","displayName":"QA 311e5480dadd","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a939a792-0178-497b-ace7-93165c24db97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 7
Location: /v1/accounts/qa-311e5480dadd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7a96e49c-fa92-482e-b0c9-5712f30f816b","handle":"qa-311e5480dadd","displayName":"QA 311e5480dadd","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.075933009Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ad116267-21b9-4b9e-afef-97d24ae26caa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad116267-21b9-4b9e-afef-97d24ae26caa
Content-Type: application/json

--- request body ---
{"handle":"qa-00f5c0ff9adf","displayName":"QA 00f5c0ff9adf","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad116267-21b9-4b9e-afef-97d24ae26caa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-00f5c0ff9adf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b9db07fb-f278-4c53-a6a1-dae21ea597a9","handle":"qa-00f5c0ff9adf","displayName":"QA 00f5c0ff9adf","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.123036991Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36cc6ae8-76c4-4b92-9663-f56eaf66ae8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36cc6ae8-76c4-4b92-9663-f56eaf66ae8b
Content-Type: application/json

--- request body ---
{"handle":"qa-311e5480dadd","password":"****"}

--- response: 200 in 53 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-36cc6ae8-76c4-4b92-9663-f56eaf66ae8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7a96e49c-fa92-482e-b0c9-5712f30f816b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-643ffc73-f9de-434c-93fd-078ecfffd612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643ffc73-f9de-434c-93fd-078ecfffd612
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-00f5c0ff9adf","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-643ffc73-f9de-434c-93fd-078ecfffd612
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
Location: /v1/conversations/cnv_3793184e-0432-4204-845c-915074bac4eb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3793184e-0432-4204-845c-915074bac4eb","subject":"Error contract","status":"open","region":"eu","participants":["qa-311e5480dadd","qa-00f5c0ff9adf"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.250609485Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e68ad77b-d603-4ab5-8307-93f50f36c9bf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6c63ae3182994d3485d0aec79f0e261c
X-Fault-Key: a261fb5c-46ea-435f-9b15-b0078cae37f1
X-Fault: unavailable-once
X-Correlation-Id: qa-e68ad77b-d603-4ab5-8307-93f50f36c9bf
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e68ad77b-d603-4ab5-8307-93f50f36c9bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-e68ad77b-d603-4ab5-8307-93f50f36c9bf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7f7cf2db-fdbb-467f-9b30-ddc34510bd83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f7cf2db-fdbb-467f-9b30-ddc34510bd83
Content-Type: application/json

--- request body ---
{"handle":"qa-00f5c0ff9adf","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f7cf2db-fdbb-467f-9b30-ddc34510bd83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b9db07fb-f278-4c53-a6a1-dae21ea597a9"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-71d80602-ac98-4cc7-aa37-f4342074add4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71d80602-ac98-4cc7-aa37-f4342074add4
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-71d80602-ac98-4cc7-aa37-f4342074add4
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
correlation: qa-9b05208e-209f-4bb8-88e3-672a6100ba39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b05208e-209f-4bb8-88e3-672a6100ba39
Content-Type: application/json

--- request body ---
{"handle":"qa-00f5c0ff9adf","password":"****"}

--- response: 401 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9b05208e-209f-4bb8-88e3-672a6100ba39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9b05208e-209f-4bb8-88e3-672a6100ba39"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f14f9875-3885-41b1-b156-afe93cfc04a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f14f9875-3885-41b1-b156-afe93cfc04a0
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f14f9875-3885-41b1-b156-afe93cfc04a0
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
correlation: qa-94024cc3-61cd-41d6-b05e-296785596b6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94024cc3-61cd-41d6-b05e-296785596b6f
Content-Type: application/json

--- request body ---
{"handle":"qa-311e5480dadd","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94024cc3-61cd-41d6-b05e-296785596b6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-94024cc3-61cd-41d6-b05e-296785596b6f"}
```
