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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-f3c898e6-159c-40d5-b4be-812ef3161641` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-2eeced15-f6f1-4a74-acdd-4d1d950177a9` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-4fb780ec-f282-47ed-b9a2-2adc8af75b57` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-41a69408-7b48-4252-8312-92183ba082ec` |
| 5 | `POST /v1/conversations` | 503 | 12 | `qa-69a6f62b-2404-4652-9530-9bc551651374` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-3d79e56f-fd93-427f-afdf-a40d0e4fc964` |
| 7 | `DELETE /v1/accounts/me` | 204 | 50 | `qa-1938c74b-efc8-4c69-afb4-84dddf2b2448` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-bed5d8d5-8413-490b-917a-ac296dad5982` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-182bb47d-2c04-41c1-b431-ac1d8e9abb08` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-5b6f0f86-a3e7-47c8-bb62-54fdc8c6080c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f3c898e6-159c-40d5-b4be-812ef3161641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3c898e6-159c-40d5-b4be-812ef3161641
Content-Type: application/json

--- request body ---
{"handle":"qa-44a89090cc27","displayName":"QA 44a89090cc27","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3c898e6-159c-40d5-b4be-812ef3161641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 483
RateLimit-Reset: 8
Location: /v1/accounts/qa-44a89090cc27
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b80d7c95-d5e3-437a-8762-1c5eb7e6a829","handle":"qa-44a89090cc27","displayName":"QA 44a89090cc27","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.489911962Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2eeced15-f6f1-4a74-acdd-4d1d950177a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eeced15-f6f1-4a74-acdd-4d1d950177a9
Content-Type: application/json

--- request body ---
{"handle":"qa-2bdb63798994","displayName":"QA 2bdb63798994","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eeced15-f6f1-4a74-acdd-4d1d950177a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-2bdb63798994
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00c8ddf5-64d7-4baa-b533-c5d27e61a043","handle":"qa-2bdb63798994","displayName":"QA 2bdb63798994","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.533916052Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4fb780ec-f282-47ed-b9a2-2adc8af75b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fb780ec-f282-47ed-b9a2-2adc8af75b57
Content-Type: application/json

--- request body ---
{"handle":"qa-44a89090cc27","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4fb780ec-f282-47ed-b9a2-2adc8af75b57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b80d7c95-d5e3-437a-8762-1c5eb7e6a829"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-41a69408-7b48-4252-8312-92183ba082ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41a69408-7b48-4252-8312-92183ba082ec
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2bdb63798994","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-41a69408-7b48-4252-8312-92183ba082ec
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
Location: /v1/conversations/cnv_aa3d22a3-7f4d-4ef8-8764-55e3d950da7a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_aa3d22a3-7f4d-4ef8-8764-55e3d950da7a","subject":"Error contract","status":"open","region":"eu","participants":["qa-44a89090cc27","qa-2bdb63798994"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:47.611633129Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-69a6f62b-2404-4652-9530-9bc551651374

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e2cc2e85-8d28-49ac-b5e3-cfa783cf184f
X-Correlation-Id: qa-69a6f62b-2404-4652-9530-9bc551651374
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-44a89090cc27","subject":"Probe","message":"Hi"}

--- response: 503 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-69a6f62b-2404-4652-9530-9bc551651374
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-69a6f62b-2404-4652-9530-9bc551651374"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-3d79e56f-fd93-427f-afdf-a40d0e4fc964

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d79e56f-fd93-427f-afdf-a40d0e4fc964
Content-Type: application/json

--- request body ---
{"handle":"qa-2bdb63798994","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d79e56f-fd93-427f-afdf-a40d0e4fc964
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00c8ddf5-64d7-4baa-b533-c5d27e61a043"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1938c74b-efc8-4c69-afb4-84dddf2b2448

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1938c74b-efc8-4c69-afb4-84dddf2b2448
Content-Type: application/json

--- response: 204 in 50 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1938c74b-efc8-4c69-afb4-84dddf2b2448
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
correlation: qa-bed5d8d5-8413-490b-917a-ac296dad5982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bed5d8d5-8413-490b-917a-ac296dad5982
Content-Type: application/json

--- request body ---
{"handle":"qa-2bdb63798994","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bed5d8d5-8413-490b-917a-ac296dad5982
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bed5d8d5-8413-490b-917a-ac296dad5982"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-182bb47d-2c04-41c1-b431-ac1d8e9abb08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-182bb47d-2c04-41c1-b431-ac1d8e9abb08
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-182bb47d-2c04-41c1-b431-ac1d8e9abb08
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
correlation: qa-5b6f0f86-a3e7-47c8-bb62-54fdc8c6080c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6f0f86-a3e7-47c8-bb62-54fdc8c6080c
Content-Type: application/json

--- request body ---
{"handle":"qa-44a89090cc27","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b6f0f86-a3e7-47c8-bb62-54fdc8c6080c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b6f0f86-a3e7-47c8-bb62-54fdc8c6080c"}
```
