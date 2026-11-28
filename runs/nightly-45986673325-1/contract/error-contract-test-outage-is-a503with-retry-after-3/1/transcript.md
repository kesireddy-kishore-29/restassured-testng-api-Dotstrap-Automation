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
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-3d2b8f24-6cd7-4f9f-87d4-3edf54295629` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-37b18777-2957-4415-8742-7727162e9db1` |
| 3 | `POST /v1/auth/token` | 200 | 46 | `qa-9735fae0-23a1-43ad-8e59-6bc9b9b0c109` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-102ec2ea-103b-4fb4-bd57-125d58efb3e0` |
| 5 | `PATCH /v1/accounts/me` | 503 | 27 | `qa-a5164fe3-e788-4756-9e5d-51529897b9d4` |
| 6 | `POST /v1/auth/token` | 200 | 111 | `qa-b110c7b6-c9d1-4b40-bcdd-8d1b96552b71` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-dba5059d-2302-4cea-9b8d-34e4051232f2` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-e03784b6-cb99-4682-b8eb-ef600ff53c88` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-0ee9d689-007e-447c-a3a9-c12eb27beb7b` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-6acaef4b-ce19-480a-9093-cf71b198109a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d2b8f24-6cd7-4f9f-87d4-3edf54295629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d2b8f24-6cd7-4f9f-87d4-3edf54295629
Content-Type: application/json

--- request body ---
{"handle":"qa-eb9859652a0c","displayName":"QA eb9859652a0c","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d2b8f24-6cd7-4f9f-87d4-3edf54295629
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-eb9859652a0c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a67ef934-ce77-48e0-b7a9-451b0fdbaca4","handle":"qa-eb9859652a0c","displayName":"QA eb9859652a0c","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.027303531Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-37b18777-2957-4415-8742-7727162e9db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b18777-2957-4415-8742-7727162e9db1
Content-Type: application/json

--- request body ---
{"handle":"qa-261ce13dc495","displayName":"QA 261ce13dc495","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-37b18777-2957-4415-8742-7727162e9db1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 557
RateLimit-Reset: 9
Location: /v1/accounts/qa-261ce13dc495
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3f9a3547-749d-4e0b-a591-5e34f78bc6bc","handle":"qa-261ce13dc495","displayName":"QA 261ce13dc495","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.083853926Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9735fae0-23a1-43ad-8e59-6bc9b9b0c109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9735fae0-23a1-43ad-8e59-6bc9b9b0c109
Content-Type: application/json

--- request body ---
{"handle":"qa-eb9859652a0c","password":"****"}

--- response: 200 in 46 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9735fae0-23a1-43ad-8e59-6bc9b9b0c109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 545
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a67ef934-ce77-48e0-b7a9-451b0fdbaca4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-102ec2ea-103b-4fb4-bd57-125d58efb3e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-102ec2ea-103b-4fb4-bd57-125d58efb3e0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-261ce13dc495","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-102ec2ea-103b-4fb4-bd57-125d58efb3e0
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
Location: /v1/conversations/cnv_002421f4-bafc-4ecc-b950-a88bd3f09d83
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_002421f4-bafc-4ecc-b950-a88bd3f09d83","subject":"Error contract","status":"open","region":"eu","participants":["qa-eb9859652a0c","qa-261ce13dc495"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.186826594Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a5164fe3-e788-4756-9e5d-51529897b9d4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 9f8c2e02-9a93-4112-aa08-113d0475166b
X-Correlation-Id: qa-a5164fe3-e788-4756-9e5d-51529897b9d4
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 27 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5164fe3-e788-4756-9e5d-51529897b9d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-a5164fe3-e788-4756-9e5d-51529897b9d4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b110c7b6-c9d1-4b40-bcdd-8d1b96552b71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b110c7b6-c9d1-4b40-bcdd-8d1b96552b71
Content-Type: application/json

--- request body ---
{"handle":"qa-261ce13dc495","password":"****"}

--- response: 200 in 111 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b110c7b6-c9d1-4b40-bcdd-8d1b96552b71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3f9a3547-749d-4e0b-a591-5e34f78bc6bc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dba5059d-2302-4cea-9b8d-34e4051232f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba5059d-2302-4cea-9b8d-34e4051232f2
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dba5059d-2302-4cea-9b8d-34e4051232f2
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
correlation: qa-e03784b6-cb99-4682-b8eb-ef600ff53c88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e03784b6-cb99-4682-b8eb-ef600ff53c88
Content-Type: application/json

--- request body ---
{"handle":"qa-261ce13dc495","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e03784b6-cb99-4682-b8eb-ef600ff53c88
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e03784b6-cb99-4682-b8eb-ef600ff53c88"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ee9d689-007e-447c-a3a9-c12eb27beb7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ee9d689-007e-447c-a3a9-c12eb27beb7b
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ee9d689-007e-447c-a3a9-c12eb27beb7b
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
correlation: qa-6acaef4b-ce19-480a-9093-cf71b198109a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6acaef4b-ce19-480a-9093-cf71b198109a
Content-Type: application/json

--- request body ---
{"handle":"qa-eb9859652a0c","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6acaef4b-ce19-480a-9093-cf71b198109a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6acaef4b-ce19-480a-9093-cf71b198109a"}
```
