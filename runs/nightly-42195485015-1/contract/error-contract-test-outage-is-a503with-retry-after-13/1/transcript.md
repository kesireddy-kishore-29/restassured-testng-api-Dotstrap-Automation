# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-f4168511-baac-46fd-8aca-74aea1bb4c6c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-04819214-09cb-40dd-85d5-b3716517d556` |
| 3 | `POST /v1/auth/token` | 200 | 93 | `qa-cd9c770d-fc20-490b-9736-1a19a74fee1b` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-32640810-28f4-4280-a88d-e144365437fc` |
| 5 | `GET /v1/credits/balance` | 503 | 18 | `qa-4d01bd43-9cae-4143-8428-cc07b8d2cbec` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-34b57ab1-4454-4d74-bacb-6d308e069de6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-66270c05-9d87-4f15-8a53-0291310a626b` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-38335a5e-d8fb-43f8-94ee-225e5b6e949b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-a1e6e735-ce26-4800-bce1-f9392edffd39` |
| 10 | `POST /v1/auth/token` | 401 | 21 | `qa-b381dcd5-3258-44b7-8039-129c71c74957` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f4168511-baac-46fd-8aca-74aea1bb4c6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4168511-baac-46fd-8aca-74aea1bb4c6c
Content-Type: application/json

--- request body ---
{"handle":"qa-9f50e33154dc","displayName":"QA 9f50e33154dc","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4168511-baac-46fd-8aca-74aea1bb4c6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Location: /v1/accounts/qa-9f50e33154dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0fcfb1fd-0a72-4357-8b48-6c9049e110cd","handle":"qa-9f50e33154dc","displayName":"QA 9f50e33154dc","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.128623055Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04819214-09cb-40dd-85d5-b3716517d556

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04819214-09cb-40dd-85d5-b3716517d556
Content-Type: application/json

--- request body ---
{"handle":"qa-3e3368025178","displayName":"QA 3e3368025178","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-04819214-09cb-40dd-85d5-b3716517d556
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-3e3368025178
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f3571bdc-10d8-4426-936d-904228b617bc","handle":"qa-3e3368025178","displayName":"QA 3e3368025178","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.189347148Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-cd9c770d-fc20-490b-9736-1a19a74fee1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd9c770d-fc20-490b-9736-1a19a74fee1b
Content-Type: application/json

--- request body ---
{"handle":"qa-9f50e33154dc","password":"****"}

--- response: 200 in 93 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd9c770d-fc20-490b-9736-1a19a74fee1b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0fcfb1fd-0a72-4357-8b48-6c9049e110cd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-32640810-28f4-4280-a88d-e144365437fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32640810-28f4-4280-a88d-e144365437fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e3368025178","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-32640810-28f4-4280-a88d-e144365437fc
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
Location: /v1/conversations/cnv_4eb4d35c-468d-4a06-814d-6ab5630cda4c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4eb4d35c-468d-4a06-814d-6ab5630cda4c","subject":"Error contract","status":"open","region":"eu","participants":["qa-9f50e33154dc","qa-3e3368025178"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.334889959Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-4d01bd43-9cae-4143-8428-cc07b8d2cbec

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 296cc10c-b824-4750-99db-6787b0a92740
X-Correlation-Id: qa-4d01bd43-9cae-4143-8428-cc07b8d2cbec
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d01bd43-9cae-4143-8428-cc07b8d2cbec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-4d01bd43-9cae-4143-8428-cc07b8d2cbec"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-34b57ab1-4454-4d74-bacb-6d308e069de6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34b57ab1-4454-4d74-bacb-6d308e069de6
Content-Type: application/json

--- request body ---
{"handle":"qa-3e3368025178","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-34b57ab1-4454-4d74-bacb-6d308e069de6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f3571bdc-10d8-4426-936d-904228b617bc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-66270c05-9d87-4f15-8a53-0291310a626b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66270c05-9d87-4f15-8a53-0291310a626b
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-66270c05-9d87-4f15-8a53-0291310a626b
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
correlation: qa-38335a5e-d8fb-43f8-94ee-225e5b6e949b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38335a5e-d8fb-43f8-94ee-225e5b6e949b
Content-Type: application/json

--- request body ---
{"handle":"qa-3e3368025178","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38335a5e-d8fb-43f8-94ee-225e5b6e949b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38335a5e-d8fb-43f8-94ee-225e5b6e949b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1e6e735-ce26-4800-bce1-f9392edffd39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1e6e735-ce26-4800-bce1-f9392edffd39
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1e6e735-ce26-4800-bce1-f9392edffd39
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
correlation: qa-b381dcd5-3258-44b7-8039-129c71c74957

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b381dcd5-3258-44b7-8039-129c71c74957
Content-Type: application/json

--- request body ---
{"handle":"qa-9f50e33154dc","password":"****"}

--- response: 401 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b381dcd5-3258-44b7-8039-129c71c74957
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b381dcd5-3258-44b7-8039-129c71c74957"}
```
